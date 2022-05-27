package com.example.wechatdemo.wechat.controller.work;


import cn.hutool.core.util.ObjectUtil;
import com.example.wechatdemo.wechat.constant.CommentConstant;
import com.example.wechatdemo.wechat.entity.*;
import com.example.wechatdemo.wechat.exception.BusinessErrorException;
import com.example.wechatdemo.wechat.exception.BusinessMsgEnum;
import com.example.wechatdemo.wechat.exception.ErrorCode;
import com.example.wechatdemo.wechat.service.work.WorkService;
import com.example.wechatdemo.wechat.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@Slf4j
public class WorkController {
    @Autowired
    private WorkService workService;
//    @Autowired
//    private RedisCacheComponent redisCacheComponent;
    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

//    @Value("${group.urlIn:neobank://v.bnc.com/53?groupId=74d61b46d0534c3dbf6ee98653987dd0&uid=1322768&msg=Kamu diundang untuk masuk ke grup bisnis!}")
//    private String groupUrlIn;


    @PostMapping("work/search/goods")
    public R selectGoodByElasticsearch(String searchName){
        System.out.println("搜索searchName:" + searchName);
        SearchQuery searchQuery=new NativeSearchQuery(QueryBuilders.matchQuery("name",searchName));
        List<Druggood> goodVoList = elasticsearchRestTemplate.queryForList(searchQuery, Druggood.class);
        if (CollectionUtils.isEmpty(goodVoList)){
            return R.error(Integer.valueOf(BusinessMsgEnum.NULL_EXCEPTION.code()) , BusinessMsgEnum.NULL_EXCEPTION.msg());
        }
        List<GoodVo> voList = new ArrayList<>();
        goodVoList.forEach(good->{
            GoodVo vo = new GoodVo();
            vo.setGoods_id(good.getDruggoodid());
            vo.setName(good.getName());
            vo.setImg(good.getImg());
            vo.setPrice(good.getPrice().toString());
            vo.setSlogan(good.getSlogan());
            voList.add(vo);
        });
        HashMap<String, Object> map = new HashMap<>();
        map.put("selectgoods", voList);
        log.info("selectgoods的map={}", map);
        return R.ok(map);
    }


    /**
     * 患者帖子首页展示
     * */
    @PostMapping("work/product/list")
    public R postList(){
        List<Post> postList = workService.selectAllPosts();
        System.out.println("帖子:"+postList);
        Map<String,Object> map = new HashMap<>();
        List<PostVo> postVos = new ArrayList<>();
        map.put("message", postVos);
        if (CollectionUtils.isEmpty(postList)){
            return R.ok(map);
        }
        //格式化：法一
        SimpleDateFormat dateFm = new SimpleDateFormat("yyyy-MM-dd"); //格式化当前系统日期
        for (Post post : postList){
            PostVo vo = new PostVo();
            vo.setGoods_id(post.getPid());
            vo.setImg(post.getPpic());
           // vo.setImg("http://localhost:8080/image/goods/p1.jpg");
            vo.setName(post.getPcontent());
            vo.setPrice(String.valueOf(post.getPry4()));
            vo.setSlogan(post.getPry1().substring(0,post.getPry1().indexOf(" :")));
            postVos.add(vo);
        }
        return R.ok(map);
    }

    /**
     * 药品分类
     * */
    @RequestMapping("work/drug/list")
    public R drugsList(){
        List<DrugsVo> voList = new ArrayList<>();
        //1、将所有大分类查询出来
        List<Drugclassification> allDrugclass = workService.selAllDrugclass();
        for (Drugclassification drugClass : allDrugclass){
            DrugsVo vo = new DrugsVo();
            vo.setId(drugClass.getDrugclassid());
            vo.setTitle(drugClass.getTitle());
            vo.setBanner("http://localhost:8080/image/category/banner.jpg");

            //2、遍历查询出来的大分类，通过每一个大分类的id查找所有小分类
            List<Drugsegmentation> drugsegmentations = workService.selDrugsegByDrugclassId(drugClass.getDrugclassid());
            List<SmallDrugs> smallDrugsList = new ArrayList<>();
            for (Drugsegmentation drugsegmentation : drugsegmentations){
                SmallDrugs smallDrugs = new SmallDrugs();
                smallDrugs.setId(drugsegmentation.getDrugsegid());
                smallDrugs.setName(drugsegmentation.getName());
                smallDrugs.setImg(drugsegmentation.getImg());
                smallDrugsList.add(smallDrugs);
            }
            vo.setList(smallDrugsList);
            voList.add(vo);
        }
        Map<String,Object> map = new HashMap<>();
        map.put("drug", voList);
        System.out.println("map"+map);
        return R.ok(map);
    }

    /**
     * 分类要求展示(包括搜索查询命中到的)
     * */
    @PostMapping("work/drug/good/list")
    public R goodsList(Integer cid, String name){
        System.out.println("参数cid(此为小分类id)："+cid+"——————参数name:"+name);
        List<GoodVo> voList = new ArrayList<>();
        List<Druggood> druggoodList = null;
        if (cid == 120 && !StringUtils.isEmpty(name)){
            druggoodList = workService.selDruggoodBySearchLike(name);
            System.out.println("搜索到的商品："+druggoodList);
        }
        else if (cid == 121 && name.equals("医生")){
            List<Doctor> doctorList = workService.selAllDoctor();
            //将搜索到的医生组装下返回给前端
            for (Doctor doctor: doctorList){
                GoodVo vo = new GoodVo();
                vo.setGoods_id(doctor.getDid());
                //医生介绍
                vo.setName(doctor.getDdescript());
                //医生图片
                vo.setImg(doctor.getUser().getUpicture());
                //医生科室
                vo.setPrice(doctor.getDoffice());
                //医生姓+职称   例：刘医师
                vo.setSlogan(doctor.getUser().getUname().substring(0,1)+doctor.getDrank());
                voList.add(vo);
            }
            Map<String,Object> map = new HashMap<>();
            map.put("drugGoods", voList);
            System.out.println("map"+map);
            return R.ok(map);
        }
        else {
            //通过小分类id查询药品
            druggoodList = workService.selDruggoodByDrugsegId(cid);
            System.out.println("小分类商品："+druggoodList);

        }
        if (CollectionUtils.isEmpty(druggoodList)){
            return R.error(Integer.valueOf(BusinessMsgEnum.NULL_EXCEPTION.code()) , BusinessMsgEnum.NULL_EXCEPTION.msg());
        }
        for (Druggood good: druggoodList){
            GoodVo vo = new GoodVo();
            vo.setGoods_id(good.getDruggoodid());
            vo.setName(good.getName());
            vo.setImg(good.getImg());
            vo.setPrice(good.getPrice().toString());
            vo.setSlogan(good.getSlogan());
            voList.add(vo);
        }

        Map<String,Object> map = new HashMap<>();
        map.put("drugGoods", voList);
        System.out.println("map"+map);
        return R.ok(map);
    }


    /**
     * 单个药品详情页
     * */
    @PostMapping("work/drug/good/detail")
    public R goodsDetail(Integer gid , String type){
        System.out.println("参数gid 或 帖子id："+gid + "___type为：" + type);
        if (type.equals("帖子")){
            System.out.println("type为帖子时进入" + type);
        }
        //通过该单个药品id查找药商品表
        Druggood druggood = workService.seleOneByDruggoodId(gid);

        //先查缓存，无缓冲查数据库
        //Druggood druggood = redisCacheComponent.queryDruggoodFromCache(gid);
        if (Objects.isNull(druggood)){
            throw  BusinessErrorException.error(ErrorCode.DRUGGOOD_NOT_EXIT,"药品详情不存在");
        }

        GoodsDetailVo vo = new GoodsDetailVo();
        vo.setId(druggood.getDruggoodid());
        vo.setName(druggood.getName());
        vo.setPrice(druggood.getPrice().toString());
        //选择规格的固定为1
        vo.setNumber((long) 1);

       // String[] spec= {"XS", "S", "M", "L", "XL", "XXL"};
        String[] spec= {"6g*10袋/盒", "6g*24袋/盒"};
        vo.setSpec(spec);

        List<ServiceVo> serviceVos = new ArrayList<>();
        serviceVos.add(new ServiceVo("正品保证","此商品官方保证为正品"));
        serviceVos.add(new ServiceVo("极速退款","此商品享受退货极速退款服务"));
        serviceVos.add(new ServiceVo("7天退换","此商品享受7天无理由退换服务"));
        vo.setService(serviceVos);

        List<Commentforgood> commentforgoodList = workService.selAllCommentByDruggoodId(gid);
        Commentforgood commentforgood = commentforgoodList.get(0);
        //拿数据库第一条数据（或者好评最高的一条）
        vo.setComment(new CommentVo((long)124, commentforgood.getUserface(),"上帝爱裸睡",commentforgood.getContent()));


        //详情轮播图
        ArrayList<GoodDetailSwiper> swiperList = new ArrayList<>();
        swiperList.add(new GoodDetailSwiper(1,druggood.getImg()));
        swiperList.add(new GoodDetailSwiper(2,druggood.getImg()));
        swiperList.add(new GoodDetailSwiper(3,druggood.getImg()));
        swiperList.add(new GoodDetailSwiper(4,druggood.getImg()));

        Map<String,Object> map = new HashMap<>();
        map.put("drugGoodsDetail", vo);
        map.put("swiperList", swiperList);
        System.out.println("map"+map);
        return R.ok(map);
    }

    /**
     * 单个药品详情页中的 商品评价
     * */
    @PostMapping("work/drug/good/detail/comment")
    public R goodsComment(Integer ggid){
        System.out.println("参数ggid："+ggid);
        //根据商品id,查找该商品在评论表里所有评论

        List<Commentforgood> commentforgoodList = workService.selAllCommentByDruggoodId(ggid);
        List<GoodCommentVo> vo = new ArrayList<>();
        for (Commentforgood commentforgood : commentforgoodList){
            GoodCommentVo commentVo = new GoodCommentVo();
            commentVo.setId(commentforgood.getCommentid());
            commentVo.setUsername("刘东烨"+commentforgood.getCommentid());
            commentVo.setFace(commentforgood.getUserface());
            commentVo.setDate(commentforgood.getDate());
            commentVo.setSpec(commentforgood.getSpec());
            commentVo.setGrade(commentforgood.getGrade());

            FirstVo firstVo = new FirstVo();
            firstVo.setContent(commentforgood.getContent());
            String[] img = {"http://localhost:8080/image/goods/y15.jpg",
                    "http://localhost:8080/image/goods/y16.jpg",
                    "http://localhost:8080/image/goods/y18.jpg"};
            firstVo.setImg(img);
            //firstVo.setVideo();
            commentVo.setFirst(firstVo);

            //追评
            AppendVo appendVo = new AppendVo();
            //追加日期 xx天后追加
            appendVo.setDate(66);
            appendVo.setContent(commentforgood.getAddtwocontent());
            appendVo.setImg(img);
            commentVo.setAppend(appendVo);
            vo.add(commentVo);
        }

        //第一个评论



        //第二个评论
//        GoodCommentVo commentVo2 = new GoodCommentVo();
//        commentVo2.setId(2);
//        commentVo2.setUsername("刘东烨2");
//        commentVo2.setFace("http://localhost:8080/image/goods/p9.jpg");
//        commentVo2.setDate("2022-06-26");
//        commentVo2.setSpec("规格: L");
//        commentVo2.setGrade("good");
//
//        FirstVo firstVo2 = new FirstVo();
//        firstVo2.setContent("秀啊666，不愧是专业的，才拿到手上就研究了半天才装上");
//        String[] img2 = {"http://localhost:8080/image/goods/p5.jpg",
//                "http://localhost:8080/image/goods/p6.jpg",
//                "http://localhost:8080/image/goods/p7.jpg"};
//        firstVo2.setImg(img2);
//        //firstVo.setVideo();
//        commentVo2.setFirst(firstVo2);
//        vo.add(commentVo2);


        Map<String,Object> map = new HashMap<>();
        map.put("drugGoodsDetailComment", vo);
        System.out.println("map"+map);
        return R.ok(map);
    }


    /**
     * 确认订单中的 默认地址
     * */
    @RequestMapping("work/drug/good/detail/defaultAddress")
    public R getDefaultAddress(Integer ggid){
        System.out.println("订单支付中的ggid："+ggid);

        Address address = workService.selDefautAdress(CommentConstant.UID);
        RecinfoVo vo = new RecinfoVo();
        vo.setId(address.getId());
        vo.setName(address.getUsername());
        vo.setHead(address.getUsername().substring(0,1));
        vo.setTel(address.getTelphone());

        AddressVo addressVo = new AddressVo();
        RegionVo regionVo = new RegionVo();
        regionVo.setLabel(address.getLabel());
        Integer[] value = {18, 2, 1};
        regionVo.setValue(value);
        regionVo.setCityCode("440304");

        addressVo.setRegion(regionVo);
        addressVo.setDetailed(address.getDetail());

        vo.setAddress(addressVo);
        vo.setIsDefault(true);

        Map<String,Object> map = new HashMap<>();
        map.put("defaultAddress", vo);
        System.out.println("map"+map);
        return R.ok(map);
    }


    /**
     * 确认订单中的 地址管理
     * */
    @RequestMapping("work/drug/good/detail/addressManagement")
    public R getAddressManagement(Integer aggid){
        System.out.println("前端传过来来的aggid："+aggid);
        List<Address> addressList = workService.selAllAdress(CommentConstant.UID);
        List<RecinfoVo> vos = new ArrayList<>();
        for (Address address : addressList){
            RecinfoVo recinfoVo = new RecinfoVo();
            recinfoVo.setId(address.getId());
            recinfoVo.setName(address.getUsername());
            recinfoVo.setHead(address.getUsername().substring(0,1));
            recinfoVo.setTel(address.getDetail());
            AddressVo addressVo = new AddressVo();
            RegionVo regionVo = new RegionVo();
            regionVo.setLabel(address.getLabel());
            Integer[] value = {18, 2, 1};
            regionVo.setValue(value);
            regionVo.setCityCode("440304");
            addressVo.setRegion(regionVo);
            addressVo.setDetailed(address.getDetail());
            recinfoVo.setAddress(addressVo);
            recinfoVo.setIsDefault(false);
            if (address.getIsdefault().equals(CommentConstant.DEFAULT_ADDRESS)){
                recinfoVo.setIsDefault(true);
            }
            vos.add(recinfoVo);
        }
        Map<String,Object> map = new HashMap<>();
        map.put("addressManagement", vos);
        System.out.println("map"+map);
        return R.ok(map);
    }



    /**
     * 购物车  （新增 购物车表 字段：cartId, uid, gid）
     * 参数：uid：用户id
     * */
    @PostMapping("work/home/cart")
    public R getCartgoods(Integer uid){
        System.out.println("参数uid："+uid);
        //通过用户id 查找所有购物车，再拿购物车表里的商品id去查找所有的商品表
        List<Cart> cartList = workService.selAllCart(CommentConstant.UID);
        List<CartGoodsVo> vos = new ArrayList<>();
        for (Cart cart: cartList){
            Druggood druggood = workService.seleOneByDruggoodId(cart.getGoodid());
            CartGoodsVo cartGoodsVo = new CartGoodsVo();
            cartGoodsVo.setId(cart.getCartid());
            cartGoodsVo.setImg(druggood.getImg());
            cartGoodsVo.setSpec("规格:S码");
            cartGoodsVo.setName(druggood.getName());
            cartGoodsVo.setPrice(Double.valueOf(druggood.getPrice().toString()));
            cartGoodsVo.setNumber(1);
            cartGoodsVo.setSelected(false);
            vos.add(cartGoodsVo);
        }
        Map<String,Object> map = new HashMap<>();
        map.put("cartGoods", vos);
        System.out.println("map"+map);
        return R.ok(map);
    }



    /**
     * 我的订单 （新增 订单表 字段：orderId, uid, gid）
     * 参数：uid：用户id
     * */
    @PostMapping("work/home/order")
    public R getOrdergoods(Integer uid){
        System.out.println("参数uid："+uid);
        //通过uid查找订单表
        List<List<OrderVo>> vo = new ArrayList<>();
        List<OrderVo> voList = new ArrayList<>();

        OrderVo orderVo = new OrderVo();
        orderVo.setType("unpaid");
        orderVo.setOrdersn(0);
        orderVo.setGoods_id(1);
        orderVo.setImg("http://localhost:8080/image/goods/p3.jpg");
        orderVo.setName("我的订单的商品名称");
        orderVo.setPrice("109");
        orderVo.setPayment(166);
        orderVo.setFreight(14);
        orderVo.setSpec("规格:S码");
        orderVo.setNumner(1);

        OrderVo orderVo2 = new OrderVo();
        orderVo2.setType("back");
        orderVo2.setOrdersn(1);
        orderVo2.setGoods_id(2);
        orderVo2.setName("我的订单的商2品名称");
        orderVo2.setImg("http://localhost:8080/image/goods/p3.jpg");
        orderVo2.setName("我的订单2的商品名称");
        orderVo2.setPrice("142");
        orderVo2.setPayment(112);
        orderVo2.setFreight(14);
        orderVo2.setSpec("规格:S码");
        orderVo2.setNumner(1);
        voList.add(orderVo2);


        List<OrderVo> voList2 = new ArrayList<>();
        OrderVo orderVo3 = new OrderVo();
        orderVo3.setType("unpaid");
        orderVo3.setOrdersn(4);
        orderVo3.setGoods_id(1);
        orderVo3.setImg("http://localhost:8080/image/goods/p3.jpg");
        orderVo3.setName("我的订单的商品名称");
        orderVo3.setPrice("109");
        orderVo3.setPayment(166);
        orderVo3.setFreight(14);
        orderVo3.setSpec("规格:S码");
        orderVo3.setNumner(1);
        voList2.add(orderVo3);


        vo.add(voList);
        vo.add(voList2);
        Map<String,Object> map = new HashMap<>();
        map.put("getOrdergoods", vo);
        System.out.println("map"+map);
        return R.ok(map);
        }



    /**
     * 我的收藏  （新增 收藏表 字段：keepId, uid, gid）
     * 参数：uid：用户id
     * */
    @PostMapping("work/home/keep")
    public R getKeepgoods(Integer uid){
        System.out.println("参数uid："+uid);
        //通过用户id 查找收藏表 查询该用户下所有收藏表的药商品
        List<Mykeep> mykeepList = workService.selAllKeep(CommentConstant.UID);
        List<CartGoodsVo> vos = new ArrayList<>();
        for (Mykeep mykeep : mykeepList){
            Druggood druggood = workService.seleOneByDruggoodId(mykeep.getGoodid());
            CartGoodsVo cartGoodsVo = new CartGoodsVo();
            cartGoodsVo.setId(mykeep.getKeepid());
            cartGoodsVo.setName(druggood.getName());
            cartGoodsVo.setImg(druggood.getImg());
            cartGoodsVo.setSpec(mykeep.getSpec());
           // cartGoodsVo.setPrice(Integer.valueOf(druggood.getPrice().toString()));
            cartGoodsVo.setPrice(Double.valueOf(druggood.getPrice().toString()));
            cartGoodsVo.setNumber(1);
            cartGoodsVo.setSelected(false);
            vos.add(cartGoodsVo);
        }
        Map<String,Object> map = new HashMap<>();
        map.put("getKeepgoods", vos);
        System.out.println("map"+map);
        return R.ok(map);
    }


    /**
     * 随机预约
     * */
    @RequestMapping("work/home/appointment")
    public R riddonappointment(){  //public void drugsList(Integer cid){
       // System.out.println("预约menu的id:"+cid);
        int uid = CommentConstant.UID;
        //医生那边搞个状态，在所有上班的医生中随机预约
        List<Doctor> doctorList = workService.selAllDoctor();
        List<Integer> didList = new ArrayList<>();
        doctorList.forEach(doctor -> didList.add(doctor.getDid()));
        Random random = new Random();
        Integer randomDid = didList.get(random.nextInt(didList.size()));

        Appointment appointment = new Appointment();
        appointment.setUid(uid);
        appointment.setDid(randomDid);
        appointment.setAyuyuename("小程序端预约用户"+randomDid);
        appointment.setAstate("0");//预约状态 0代办 1成功3 失败
        appointment.setAmoneny("0");//预约已付金额 默认10块 //此处为0

        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        String timePay = dateFormat.format(date);
        appointment.setAry1(timePay);
        int insertAppoint = workService.insertAppoint(appointment);
        Map<String,Object> map = new HashMap<>();

        if (insertAppoint > 0){
            map.put("appointstate", true);
            log.info("预约成功");
            return R.ok(map);
        }else {
            map.put("appointstate", false);
            log.info("预约失败");
            return R.ok(map);
        }
    }


    /**
     * 随机预约
     * */
    @RequestMapping("work/home/pullPost")
    public R pullPost(String descriptsick, String posttag){  //public void drugsList(Integer cid){
        Map<String,Object> map = new HashMap<>();
        System.out.println("随机预约传过来的descriptsick:"+descriptsick+"——————posttag："+posttag);
        if (StringUtils.isEmpty(descriptsick)){
            map.put("poststate", false);
            log.info("预约失败,描述不能为空");
            return R.ok(map);
        }
        if (StringUtils.isEmpty(posttag)){
            posttag = "未知";
        }
        int uid = CommentConstant.UID;
        //医生那边搞个状态，在所有上班的医生中随机预约
        Post post = new Post();
        post.setPcontent(descriptsick);
        post.setPtag(posttag);
        post.setUid(uid);

        //帖子图片暂时写死
        post.setPpic("http://123.57.227.61/bookStore/images/69373cb4-d5e6-40f0-83c5-3e83fe54e730.jpg");
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        String formatTime = dateFormat.format(date);
        //发帖时间
        post.setPry1(formatTime);
        post.setPry4(0);
       int insertPost = workService.insertPost(post);
       System.out.println("帖子插入个数:"+insertPost);
        if (insertPost > 0){
            map.put("poststate", true);
            log.info("预约成功");
            return R.ok(map);
        }else {
            map.put("poststate", false);
            log.info("预约失败");
            return R.ok(map);
        }
    }



























//    /**
//     * 患者帖子首页展示
//     * */
//    @PostMapping("work/product/list")
//    public R postList(){
//        List<Post> postList = workService.selectAllPosts();
//        System.out.println("帖子:"+postList);
//        Map<String,Object> map = new HashMap<>();
//        List<PostVo> postVos = new ArrayList<>();
//        map.put("message", postVos);
//        if (CollectionUtils.isEmpty(postList)){
//            return R.ok(map);
//        }
//        //格式化：法一
//        SimpleDateFormat dateFm = new SimpleDateFormat("yyyy-MM-dd"); //格式化当前系统日期
//        for (Post post : postList){
//            PostVo vo = new PostVo();
//            vo.setGoods_id(post.getPid());
//            //vo.setImg(post.getPpic());
//            vo.setImg("http://localhost:8080/image/goods/p1.jpg");
//            vo.setName(post.getPcontent());
//            vo.setPrice(String.valueOf(post.getPry4()));
//            //TODO 需格式化
//            vo.setSlogan(post.getPry1());
//            postVos.add(vo);
//        }
//        return R.ok(map);
//    }
//
//    /**
//     * 药品分类
//     * */
//    @RequestMapping("work/drug/list")
//    public R drugsList(){
//        List<DrugsVo> voList = new ArrayList<>();
//
////        中西药品
//        DrugsVo vo = new DrugsVo();
//        vo.setId(1);
//        vo.setTitle("中西药品");
//        vo.setBanner("http://localhost:8080/image/category/banner.jpg");
//        List<SmallDrugs> arrayList = new ArrayList<>();
//        arrayList.add(new SmallDrugs(1,"冰箱", "http://localhost:8080/image/category/list/2.jpg"));
//        arrayList.add(new SmallDrugs(2,"麻瓜", "http://localhost:8080/image/category/list/2.jpg"));
//        arrayList.add(new SmallDrugs(3,"冰箱", "http://localhost:8080/image/category/list/2.jpg"));
//        arrayList.add(new SmallDrugs(4,"冰箱", "http://localhost:8080/image/category/list/2.jpg"));
//        vo.setList(arrayList);
//
////       常备药品
//        DrugsVo vo2 = new DrugsVo();
//        vo2.setId(2);
//        vo2.setTitle("常备药品");
//        vo2.setBanner("http://localhost:8080/image/category/banner.jpg");
//        List<SmallDrugs> arrayList2 = new ArrayList<>();
//        arrayList2.add(new SmallDrugs(1,"冰2箱", "http://localhost:8080/image/category/list/2.jpg"));
//        arrayList2.add(new SmallDrugs(2,"麻2瓜", "http://localhost:8080/image/category/list/2.jpg"));
//        arrayList2.add(new SmallDrugs(3,"冰2箱", "http://localhost:8080/image/category/list/2.jpg"));
//        arrayList2.add(new SmallDrugs(4,"冰2箱", "http://localhost:8080/image/category/list/2.jpg"));
//        vo2.setList(arrayList2);
//
////       常用药品
//        DrugsVo vo3 = new DrugsVo();
//        vo3.setId(3);
//        vo3.setTitle("常用药品");
//        vo3.setBanner("http://localhost:8080/image/category/banner.jpg");
//        List<SmallDrugs> arrayList3 = new ArrayList<>();
//        arrayList3.add(new SmallDrugs(1,"冰3箱", "http://localhost:8080/image/category/list/2.jpg"));
//        arrayList3.add(new SmallDrugs(2,"麻3瓜", "http://localhost:8080/image/category/list/2.jpg"));
//        arrayList3.add(new SmallDrugs(3,"冰3箱", "http://localhost:8080/image/category/list/2.jpg"));
//        arrayList3.add(new SmallDrugs(4,"冰3箱", "http://localhost:8080/image/category/list/2.jpg"));
//        vo3.setList(arrayList3);
//
//
////       养生保健
//        DrugsVo vo4 = new DrugsVo();
//        vo4.setId(4);
//        vo4.setTitle("养生保健");
//        vo4.setBanner("http://localhost:8080/image/category/banner.jpg");
//        List<SmallDrugs> arrayList4 = new ArrayList<>();
//        arrayList4.add(new SmallDrugs(1,"冰4箱", "http://localhost:8080/image/category/list/2.jpg"));
//        arrayList4.add(new SmallDrugs(2,"麻4瓜", "http://localhost:8080/image/category/list/2.jpg"));
//        arrayList4.add(new SmallDrugs(3,"冰4箱", "http://localhost:8080/image/category/list/2.jpg"));
//        arrayList4.add(new SmallDrugs(4,"冰4箱", "http://localhost:8080/image/category/list/2.jpg"));
//        vo4.setList(arrayList4);
//
//
////       男科健康
//        DrugsVo vo5 = new DrugsVo();
//        vo5.setId(5);
//        vo5.setTitle("男科健康");
//        vo5.setBanner("http://localhost:8080/image/category/banner.jpg");
//        List<SmallDrugs> arrayList5 = new ArrayList<>();
//        arrayList5.add(new SmallDrugs(1,"冰5箱", "http://localhost:8080/image/category/list/2.jpg"));
//        arrayList5.add(new SmallDrugs(2,"麻5瓜", "http://localhost:8080/image/category/list/2.jpg"));
//        arrayList5.add(new SmallDrugs(3,"冰5箱", "http://localhost:8080/image/category/list/2.jpg"));
//        arrayList5.add(new SmallDrugs(4,"冰5箱", "http://localhost:8080/image/category/list/2.jpg"));
//        vo5.setList(arrayList5);
//
////       母婴专区
//        DrugsVo vo6 = new DrugsVo();
//        vo6.setId(6);
//        vo6.setTitle("母婴专区");
//        vo6.setBanner("http://localhost:8080/image/category/banner.jpg");
//        List<SmallDrugs> arrayList6 = new ArrayList<>();
//        arrayList6.add(new SmallDrugs(1,"冰6箱", "http://localhost:8080/image/category/list/2.jpg"));
//        arrayList6.add(new SmallDrugs(2,"麻6瓜", "http://localhost:8080/image/category/list/2.jpg"));
//        arrayList6.add(new SmallDrugs(3,"冰6箱", "http://localhost:8080/image/category/list/2.jpg"));
//        arrayList6.add(new SmallDrugs(4,"冰6箱", "http://localhost:8080/image/category/list/2.jpg"));
//        vo6.setList(arrayList6);
//
////       中老年健康
//        DrugsVo vo7 = new DrugsVo();
//        vo7.setId(7);
//        vo7.setTitle("中老年健康");
//        vo7.setBanner("http://localhost:8080/image/category/banner.jpg");
//        List<SmallDrugs> arrayList7 = new ArrayList<>();
//        arrayList7.add(new SmallDrugs(1,"冰7箱", "http://localhost:8080/image/category/list/2.jpg"));
//        arrayList7.add(new SmallDrugs(2,"麻7瓜", "http://localhost:8080/image/category/list/2.jpg"));
//        arrayList7.add(new SmallDrugs(3,"冰7箱", "http://localhost:8080/image/category/list/2.jpg"));
//        arrayList7.add(new SmallDrugs(4,"冰7箱", "http://localhost:8080/image/category/list/2.jpg"));
//        vo7.setList(arrayList7);
//
//
//        voList.add(vo);
//        voList.add(vo2);
//        voList.add(vo3);
//        voList.add(vo4);
//        voList.add(vo5);
//        voList.add(vo6);
//        voList.add(vo7);
//
//        Map<String,Object> map = new HashMap<>();
//        map.put("drug", voList);
//        System.out.println("map"+map);
//        return R.ok(map);
//    }
//
//    /**
//     * 分类要求展示
//     * */
//    @PostMapping("work/drug/good/list")
//    public R goodsList(Integer cid, String name){
//        System.out.println("参数cid："+cid+"——————参数name:"+name);
//        List<GoodVo> voList = new ArrayList<>();
//
////      药品1
//        GoodVo vo = new GoodVo();
//        vo.setGoods_id(1);
//        //vo.setImg(post.getPpic());
//        vo.setImg("http://localhost:8080/image/goods/p1.jpg");
//        vo.setName("后端来的药品名称");
//        vo.setPrice("668");
//        vo.setSlogan("998人付款啦");
//        voList.add(vo);
//
//        //      药品2
//        GoodVo vo2 = new GoodVo();
//        vo2.setGoods_id(2);
//        //vo.setImg(post.getPpic());
//        vo2.setImg("http://localhost:8080/image/goods/p1.jpg");
//        vo2.setName("后端2来的药品名称");
//        vo2.setPrice("668");
//        vo2.setSlogan("999人付款啦");
//        voList.add(vo2);
//
//        //      药品3
//        GoodVo vo3 = new GoodVo();
//        vo3.setGoods_id(3);
//        //vo.setImg(post.getPpic());
//        vo3.setImg("http://localhost:8080/image/goods/p1.jpg");
//        vo3.setName("后端3来的药品名称");
//        vo3.setPrice("668");
//        vo3.setSlogan("999人付款啦");
//        voList.add(vo3);
//
//        Map<String,Object> map = new HashMap<>();
//        map.put("drugGoods", voList);
//        System.out.println("map"+map);
//        return R.ok(map);
//    }
//
//
//    /**
//     * 单个药品详情页
//     * */
//    @PostMapping("work/drug/good/detail")
//    public R goodsList(Integer gid){
//        System.out.println("参数gid："+gid);
//        GoodsDetailVo vo = new GoodsDetailVo();
//        vo.setId(1);
//        vo.setName("德玛西亚标题啊达瓦达瓦达瓦");
//        vo.setPrice("923");
//
//        //选择规格的固定为1
//        vo.setNumber((long) 1);
//
//        String[] spec= {"XS", "S", "M", "L", "XL", "XXL"};
//        vo.setSpec(spec);
//
//        List<ServiceVo> serviceVos = new ArrayList<>();
//        serviceVos.add(new ServiceVo("正品保证","此商品官方保证为正品"));
//        serviceVos.add(new ServiceVo("极速退款","此商品享受退货极速退款服务"));
//        serviceVos.add(new ServiceVo("7天退换","此商品享受7天无理由退换服务"));
//        vo.setService(serviceVos);
//
//        //拿数据库第一条数据（或者好评最高的一条）
//        vo.setComment(new CommentVo((long)102, "http://localhost:8080/image/goods/p1.jpg","大黑哥","很不错，之前买了很多次了，很好看，能放很久，和图片色差不大，值得购买！"));
//
//        Map<String,Object> map = new HashMap<>();
//        map.put("drugGoodsDetail", vo);
//        System.out.println("map"+map);
//        return R.ok(map);
//    }


}
