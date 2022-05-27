package com.example.wechatdemo.wechat.mapper;

import com.example.wechatdemo.wechat.entity.Drugclassification;
import com.example.wechatdemo.wechat.entity.DrugclassificationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrugclassificationMapper {
    long countByExample(DrugclassificationExample example);

    int deleteByExample(DrugclassificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Drugclassification record);

    int insertSelective(Drugclassification record);

    List<Drugclassification> selectByExample(DrugclassificationExample example);

    Drugclassification selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Drugclassification record, @Param("example") DrugclassificationExample example);

    int updateByExample(@Param("record") Drugclassification record, @Param("example") DrugclassificationExample example);

    int updateByPrimaryKeySelective(Drugclassification record);

    int updateByPrimaryKey(Drugclassification record);
}