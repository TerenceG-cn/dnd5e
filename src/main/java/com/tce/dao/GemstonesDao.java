package com.tce.dao;

import com.tce.pojo.treasures.Gemstones;

import java.util.List;

public interface GemstonesDao {
    public List<Gemstones> getByValue(int val);//根据价值查询宝石信息
    public List<Gemstones> getByName(String name);//根据名称查询宝石信息
    public int insertGem(Gemstones gem);//新增宝石
    public  int updateGem(Gemstones user);//修改宝石信息
    public  int deleteGem(Integer id);//删除宝石
}
