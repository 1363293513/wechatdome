//package com.example.wechatdemo;
//
//import com.example.wechatdemo.wechat.entity.Druggood;
//import com.example.wechatdemo.wechat.mapper.DruggoodMapper;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
//import org.springframework.data.elasticsearch.core.query.IndexQuery;
//import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.annotation.Resource;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author : liudy
// * @version : 1.0
// * @createTime : 2022/4/24 14:57
// * @Description : xxx
// */
//
//
//@SpringBootTest(classes = {WechatdemoApplication.class})             //使用springboottest测试，依赖启动类为EsApp.class
//@RunWith(SpringRunner.class)//@RunWith就是一个运行器，表示在Spring中进行测试
//public class EsTest {
//    //注入springdataelasticsearch给我们提供的操作es的模板类对象
//    @Autowired
//    private ElasticsearchRestTemplate elasticsearchRestTemplate;
//
//    //注入mapper
//    @Resource
//    private DruggoodMapper druggoodMapper;
//
//    /**
//     * 创建索引,并设置映射
//     *
//     */
//    @Test
//    public void createIndex(){
//        //根据实体类创建索引
//        boolean isIndex = elasticsearchRestTemplate.createIndex(Druggood.class);
//        System.out.println("创建索引:"+isIndex);
//
//        //创建映射
//        boolean isMapping = elasticsearchRestTemplate.putMapping(Druggood.class);
//        System.out.println("创建映射:"+isMapping);
//    }
//
//    /**
//     * 往es中加入数据
//     *
//     */
//    @Test
//    public void addDatas(){
//        List<Druggood> all = druggoodMapper.selectByExample(null);
//        List<IndexQuery> queries=new ArrayList<>();
//        for (Druggood tbItem:all){
//            //通过IndexQuery构建对象
//            IndexQuery indexQuery = new IndexQueryBuilder().withObject(tbItem).build();
//            queries.add(indexQuery);
//        }
//        //相当于使用PUT请求，往es中新增数据
//        elasticsearchRestTemplate.bulkIndex(queries);
//    }
//
//    /**
//     * 往es中新增单条数据
//     */
////    @Test
////    public void addData(){
////        TbItem item=new TbItem();
////        item.setId(23423);
////        item.setTitle("迪奥口红");
////        item.setPrice(399);
////        item.setNum(3);
////        item.setSell_point("涂了之后,她好,我也好");
////
////        //通过IndexQuery构建对象
////        IndexQuery indexQuery=new IndexQueryBuilder().withObject(item).build();
////        //往es里面插入数据
////        elasticsearchRestTemplate.index(indexQuery);
////    }
//
//
//    /**
//     * 删除索引
//     */
////    @Test
////    public void deleteIndex(){
////        //根据指定索引名字来删除
//////        boolean isDelete = elasticsearchRestTemplate.deleteIndex("product_item");
//////        System.out.println(isDelete);
////        //根据POJO的字节码对象删除
////        boolean b = elasticsearchRestTemplate.deleteIndex(TbItem.class);
////        System.out.println(b);
////
////    }
//    /**
//     * 删除es中的数据
//     */
////    @Test
////    public void deleteData(){
////        //单条删除：根据id
////        String delete = elasticsearchRestTemplate.delete(TbItem.class, "605616");//删除成功会返回被删除商品的id
////        System.out.println(delete);
////    }
//
//    /**
//     * 修改
//     */
////    @Test
////    public void updataData() throws IOException {
////        //封装要修改的数据
////        UpdateRequest updateRequest = new UpdateRequest();
////        updateRequest.doc(XContentFactory.jsonBuilder()
////                .startObject()
////                .field("title","香奈儿口红")
////                .endObject()
////        );
////        UpdateQuery updateQuery=new UpdateQueryBuilder()
////                .withUpdateRequest(updateRequest)
////                .withClass(TbItem.class)
////                .withId("23423").build();
////        UpdateResponse updateResponse=elasticsearchRestTemplate.update(updateQuery);
////    }
//
//
//    /**
//     * 全搜索
//     */
////    @Test
////    public void machData(){
////        /*
////        在SpringData中定义了搜索的接口
////        matchAll-->mathchAllQuery()
////        match-->mathchQuery()
////        range-->rangeQuery()
////     */
////        SearchQuery searchQuery=new NativeSearchQuery(QueryBuilders.matchAllQuery());
////        List<TbItem> tbItems=elasticsearchRestTemplate.queryForList(searchQuery,TbItem.class);
////        for (TbItem t:tbItems){
////            System.out.println(t);
////        }
////    }
//
//    /**
//     * 条件搜索:IK分词
//     */
////    public void ikMachData(){
////        SearchQuery searchQuery=new NativeSearchQuery(QueryBuilders.matchQuery("title","口红"));
////        List<TbItem> tbItems=elasticsearchRestTemplate.queryForList(searchQuery,TbItem.class);
////        for (TbItem t:tbItems){
////            System.out.println(t);
////        }
////    }
//
//
//    /**
//     * 短语搜索:没有任何分词
//     */
////    @Test
////    public void matchPhraseData(){
////        SearchQuery searchQuery =new NativeSearchQuery(QueryBuilders.matchPhraseQuery("sell_point","经典神器"));
////        List<TbItem> tbItems = elasticsearchRestTemplate.queryForList(searchQuery, TbItem.class);
////        for (TbItem t : tbItems) {
////            System.out.println(t);
////        }
////    }
//    /**
//     * term搜索，多条件搜索
//     */
////    @Test
////    public void termData(){
////        SearchQuery searchQuery =new NativeSearchQuery(QueryBuilders.termsQuery("title","阿尔卡特"));
////        List<TbItem> tbItems = elasticsearchRestTemplate.queryForList(searchQuery, TbItem.class);
////        for (TbItem t : tbItems) {
////            System.out.println(t);
////        }
////    }
//
//    /**
//     * 范围搜索
//     */
////    @Test
////    public void testRange(){
////        SearchQuery searchQuery =new NativeSearchQuery(QueryBuilders.rangeQuery("price").gte(900).lte(3000));
////        List<TbItem> tbItems = elasticsearchRestTemplate.queryForList(searchQuery, TbItem.class);
////        for (TbItem t : tbItems) {
////            System.out.println(t);
////        }
////    }
//    /**
//     * 多条件搜索:must,should,must_not
//     */
////    @Test
////    public void testMulti(){
////        //多条件的封装器
////        BoolQueryBuilder builder = QueryBuilders.boolQuery();
////        List<QueryBuilder> must = builder.must();//全部都满足
////        must.add(QueryBuilders.matchQuery("sell_point","很好看"));
////        must.add(QueryBuilders.rangeQuery("price").gte(900).lte(3000));
////
////        SearchQuery searchQuery =new NativeSearchQuery(builder);
////        List<TbItem> tbItems = elasticsearchRestTemplate.queryForList(searchQuery, TbItem.class);
////        for (TbItem t : tbItems) {
////            System.out.println(t);
////        }
////    }
//    /**
//     * 分页搜索
//     */
////    @Test
////    public void testPage(){
////        SearchQuery searchQuery =new NativeSearchQuery(QueryBuilders.matchAllQuery());
////        //设置分页
////        searchQuery.setPageable(PageRequest.of(0,3));//第1页中查前3条
////        //设置排序
////        searchQuery.addSort(Sort.by(Sort.Direction.DESC,"price"));//根据价格的降序排序
////        List<TbItem> tbItems = elasticsearchRestTemplate.queryForList(searchQuery, TbItem.class);
////        for (TbItem t : tbItems) {
////            System.out.println(t);
////        }
////    }
//
//
//
//}