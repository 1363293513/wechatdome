package com.example.wechatdemo.wechat.mapper;

import com.example.wechatdemo.wechat.entity.Goodservice;
import com.example.wechatdemo.wechat.entity.GoodserviceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodserviceMapper {
    long countByExample(GoodserviceExample example);

    int deleteByExample(GoodserviceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Goodservice record);

    int insertSelective(Goodservice record);

    List<Goodservice> selectByExample(GoodserviceExample example);

    Goodservice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Goodservice record, @Param("example") GoodserviceExample example);

    int updateByExample(@Param("record") Goodservice record, @Param("example") GoodserviceExample example);

    int updateByPrimaryKeySelective(Goodservice record);

    int updateByPrimaryKey(Goodservice record);
}