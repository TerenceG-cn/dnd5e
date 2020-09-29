package com.tce.dao.character;

import com.tce.pojo.character.Sight;
import org.apache.ibatis.annotations.Insert;

public interface SightDao {
    @Insert("INSERT INTO abilityscore (characterId,darkvision,trueSight,blindsight,passivePerception) VALUES " +
            "(#{characterId},#{darkvision},#{trueSight},#{blindsight},#{passivePerception})")
    public int addSight(Sight abilityScore);//新增角色感官
}
