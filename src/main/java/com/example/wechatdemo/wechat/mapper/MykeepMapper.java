package com.example.wechatdemo.wechat.mapper;

import com.example.wechatdemo.wechat.entity.Mykeep;
import com.example.wechatdemo.wechat.entity.MykeepExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MykeepMapper {
    long countByExample(MykeepExample example);

    int deleteByExample(MykeepExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mykeep record);

    int insertSelective(Mykeep record);

    List<Mykeep> selectByExample(MykeepExample example);

    Mykeep selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mykeep record, @Param("example") MykeepExample example);

    int updateByExample(@Param("record") Mykeep record, @Param("example") MykeepExample example);

    int updateByPrimaryKeySelective(Mykeep record);

    int updateByPrimaryKey(Mykeep record);
}