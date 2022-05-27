//package com.example.wechatdemo.wechat.controller;
//
//import com.example.wechatdemo.wechat.entity.Product;
//import com.example.wechatdemo.wechat.vo.R;
//import com.example.wechatdemo.wechat.entity.User;
//import com.example.wechatdemo.wechat.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//public class UserConroller {
//
//    @Autowired
//    private UserService userService;
//
//    @RequestMapping("/login")
//    public boolean login(String uname, String upassword){
//        User user = new User();
//        user.setUname(uname);
//        user.setUpassword(upassword);
//        System.out.println("user:"+user);
//        boolean login = userService.login(user);
//        if(login){
//            return true;
//        }else {
//            return false;
//        }
//    }
//
//    @RequestMapping("/selProductList")
//    public R selUser(){
//        Product productList1 =new Product(1,"http://192.168.159.131:9999/14.jpg","李彤666666666666666", "￥555", "126人付款");
//        Product productList2 =new Product(2,"http://192.168.159.131:9999/14.jpg","李彤666666666666666", "￥665", "236人付款");
//        Product productList3 =new Product(3,"http://192.168.159.131:9999/14.jpg","李彤666666666666666", "￥775", "346人付款");
//        Product productList4 =new Product(4,"http://192.168.159.131:9999/14.jpg","李彤666666666666666", "￥885", "456人付款");
//        Product productList5 =new Product(5,"http://192.168.159.131:9999/14.jpg","说人参评擦那是覅阿士大", "￥995", "566人付款");
//        Product productList6 =new Product(6,"http://192.168.159.131:9999/14.jpg","九回复评擦那是覅阿后即", "￥115", "676人付款");
//
//        List<Product> productList= new ArrayList<>();
//        productList.add(productList1);
//        productList.add(productList2);
//        productList.add(productList3);
//        productList.add(productList4);
//        productList.add(productList5);
//        productList.add(productList6);
//
//
//        Map<String,Object> map = new HashMap<>();
//        map.put("message", productList);
//        return R.ok(map);
//
//    }
//
//
//
//
//}
