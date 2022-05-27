package com.example.wechatdemo.wechat.controller.TestDemo;

import cn.hutool.core.io.IoUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.example.wechatdemo.wechat.entity.Druggood;
import com.example.wechatdemo.wechat.mapper.DruggoodMapper;
import com.example.wechatdemo.wechat.vo.JsonResult;
import com.example.wechatdemo.wechat.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {
    //注入springdataelasticsearch给我们提供的操作es的模板类对象
    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    //注入mapper
    @Resource
    private DruggoodMapper druggoodMapper;

    /**
     * 创建索引,并设置映射
     *
     */
    @RequestMapping("/createIndexEs")
    public String createIndexEs(){
        try {
            boolean isIndex = elasticsearchRestTemplate.createIndex(Druggood.class);
            System.out.println("创建索引:"+isIndex);

            //创建映射
            boolean isMapping = elasticsearchRestTemplate.putMapping(Druggood.class);
            System.out.println("创建映射:"+isMapping);
            return "创建索引成功";
        }catch (Exception e){
            e.printStackTrace();
            return "往es中创建索引失败并打印";
        }
    }

    /**
     * 往es中加入数据
     *
     */
    @RequestMapping("/addDatasEs")
    public String addDatasEs(){
        try {
            List<Druggood> all = druggoodMapper.selectByExample(null);
            List<IndexQuery> queries=new ArrayList<>();
            for (Druggood tbItem:all){
                //通过IndexQuery构建对象
                IndexQuery indexQuery = new IndexQueryBuilder().withObject(tbItem).build();
                queries.add(indexQuery);
            }
            //相当于使用PUT请求，往es中新增数据
            elasticsearchRestTemplate.bulkIndex(queries);
            return "往es中加入数据成功";
        }catch (Exception e){
            e.printStackTrace();
            return "往es中加入数据失败并打印";
        }
    }


        /**
     * 删除索引
     */
    @RequestMapping("/deleteIndex")
    public String deleteIndex(){
        //根据指定索引名字来删除
//        boolean isDelete = elasticsearchRestTemplate.deleteIndex("product_item");
//        System.out.println(isDelete);
        //根据POJO的字节码对象删除
        try{
            boolean b = elasticsearchRestTemplate.deleteIndex(Druggood.class);
            System.out.println(b);
            return "删除成功";
        }catch (Exception e){
            e.printStackTrace();
            return "删除失败";
        }
    }






    @RequestMapping("/testdemo")
    public JsonResult testdemo(){
        int a = 1;
//        Convert.toStr(a);
        new Thread(() -> {
            System.out.println("66666666");
        } ).start();
        return null;
    }

    @RequestMapping("/export")
    @ResponseBody
    public void export(HttpServletResponse response){
        List<User> list = new ArrayList<>();
//        list.add(new User(1,"1231","password"));
//        list.add(new User(2,"1232","password"));
//        list.add(new User(3,"1233","password"));
//        list.add(new User(4,"1234","password"));
//        list.add(new User(5,"1234","password"));
//        list.add(new User(6,"1234","password"));
        // 通过工具类创建writer，默认创建xls格式
        ExcelWriter writer = ExcelUtil.getWriter();
        //自定义标题别名
        writer.addHeaderAlias("序号", "序号");
        writer.addHeaderAlias("MerchantID", "MerchantID");
        writer.addHeaderAlias("店铺名称", "店铺名称");
        // 合并单元格后的标题行，使用默认标题样式
        writer.merge(2, "申请人员信息");
        // 一次性写出内容，使用默认样式，强制输出标题
        writer.write(list, true);
        //out为OutputStream，需要写出到的目标流
        //response为HttpServletResponse对象
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        //test.xls是弹出下载对话框的文件名，不能为中文，中文请自行编码
//        String name = StringUtils.toUtf8String("申请学院");
//        response.setHeader("Content-Disposition","attachment;filename="+name+".xls");
        ServletOutputStream out= null;
        try {
            out = response.getOutputStream();
            writer.flush(out, true);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            // 关闭writer，释放内存
            writer.close();
        }
        //此处记得关闭输出Servlet流
        IoUtil.close(out);
    }

}
