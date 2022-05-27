package com.example.wechatdemo.wechat.service.work;

import com.example.wechatdemo.wechat.entity.*;

import java.util.List;

public interface WorkService {
    /**
     * 帖子
     * */
    //查询所有帖子
    List<Post> selectAllPosts();
    int insertPost(Post post);

    /**
     * 大分类
     * */
    //查询所有大分类
    List<Drugclassification> selAllDrugclass();

    /**
     * 小分类
     * */
    //根据大分类id 查询所有小分类
    List<Drugsegmentation> selDrugsegByDrugclassId(Integer drugclassId);

    /**
     * 药商品
     * */
    //通过小分类id 查询所有该小分类的 药商品
    List<Druggood> selDruggoodByDrugsegId(Integer drugsegId);

    //通过该单个药品id查找药商品表
    Druggood seleOneByDruggoodId(Integer druggoodId);

    //通过搜索框搜索药商品
    List<Druggood> selDruggoodBySearchLike(String searchKey);

    /**
     * 评论
     * */
    //根据商品id,查找该商品在评论表里所有评论
    List<Commentforgood> selAllCommentByDruggoodId(Integer druggoodId);

    /**
     * 地址
     * */
    //根据用户id查询用户默认地址
    Address selDefautAdress(Integer uid);
    //根据用户id查询用户所有地址
    List<Address> selAllAdress(Integer uid);

    /**
     * 购物车
     * */
    List<Cart> selAllCart(Integer uid);

    /**
     * 我的收藏
     * */
    List<Mykeep> selAllKeep(Integer uid);

    /**
     * 所有的医生
     * */
    List<Doctor> selAllDoctor();

    /**
     * 添加一条预约记录
     * */
    int insertAppoint(Appointment appointment);

}
