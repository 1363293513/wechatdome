package com.example.wechatdemo.wechat.mapper;

import com.example.wechatdemo.wechat.entity.Druggood;
import com.example.wechatdemo.wechat.entity.DruggoodExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DruggoodMapper {
    long countByExample(DruggoodExample example);

    int deleteByExample(DruggoodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Druggood record);

    int insertSelective(Druggood record);

    List<Druggood> selectByExample(DruggoodExample example);

    List<Druggood> selDruggoodBySearchLike(@Param("name") String searchKey);

    Druggood selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Druggood record, @Param("example") DruggoodExample example);

    int updateByExample(@Param("record") Druggood record, @Param("example") DruggoodExample example);

    int updateByPrimaryKeySelective(Druggood record);

    int updateByPrimaryKey(Druggood record);
}