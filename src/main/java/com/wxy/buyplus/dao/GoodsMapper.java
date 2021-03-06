package com.wxy.buyplus.dao;

import com.wxy.buyplus.model.Goods;

import java.util.Date;

public interface GoodsMapper {
    int deleteByPrimaryKey(String id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    Goods selectGoodsByOne(String title, String relTime, Date curTime);
}