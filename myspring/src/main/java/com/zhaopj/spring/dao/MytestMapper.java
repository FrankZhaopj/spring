package com.zhaopj.spring.dao;

import com.zhaopj.spring.entity.Mytest;

public interface MytestMapper {
    int deleteByPrimaryKey(String id);

    int insert(Mytest record);

    int insertSelective(Mytest record);

    Mytest selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Mytest record);

    int updateByPrimaryKey(Mytest record);
}