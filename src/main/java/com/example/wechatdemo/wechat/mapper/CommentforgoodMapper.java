package com.example.wechatdemo.wechat.mapper;

import com.example.wechatdemo.wechat.entity.Commentforgood;
import com.example.wechatdemo.wechat.entity.CommentforgoodExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentforgoodMapper {
    long countByExample(CommentforgoodExample example);

    int deleteByExample(CommentforgoodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Commentforgood record);

    int insertSelective(Commentforgood record);

    List<Commentforgood> selectByExample(CommentforgoodExample example);

    Commentforgood selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Commentforgood record, @Param("example") CommentforgoodExample example);

    int updateByExample(@Param("record") Commentforgood record, @Param("example") CommentforgoodExample example);

    int updateByPrimaryKeySelective(Commentforgood record);

    int updateByPrimaryKey(Commentforgood record);
}