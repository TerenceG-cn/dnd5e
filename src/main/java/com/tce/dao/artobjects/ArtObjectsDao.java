package com.tce.dao.artobjects;

import com.tce.pojo.treasures.ArtObjects;

import java.util.List;

public interface ArtObjectsDao {
    public List<ArtObjects> getByValue(int val);//根据价值查询艺术品信息
    public ArtObjects getByName(String name);//根据名称查询宝石信息
    public int insertArt(ArtObjects art);//新增宝石
    public  int updateArt(ArtObjects art);//修改宝石信息
    public  int deleteArt(Integer id);//删除宝石
}
