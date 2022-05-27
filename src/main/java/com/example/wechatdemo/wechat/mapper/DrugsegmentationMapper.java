package com.example.wechatdemo.wechat.mapper;

import com.example.wechatdemo.wechat.entity.Drugsegmentation;
import com.example.wechatdemo.wechat.entity.DrugsegmentationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrugsegmentationMapper {
    long countByExample(DrugsegmentationExample example);

    int deleteByExample(DrugsegmentationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Drugsegmentation record);

    int insertSelective(Drugsegmentation record);

    List<Drugsegmentation> selectByExample(DrugsegmentationExample example);

    Drugsegmentation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Drugsegmentation record, @Param("example") DrugsegmentationExample example);

    int updateByExample(@Param("record") Drugsegmentation record, @Param("example") DrugsegmentationExample example);

    int updateByPrimaryKeySelective(Drugsegmentation record);

    int updateByPrimaryKey(Drugsegmentation record);
}