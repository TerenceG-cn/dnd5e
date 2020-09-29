package com.tce.dao.character;

import com.tce.pojo.character.AbilityScore;
import org.apache.ibatis.annotations.Insert;

public interface AbilityScoreDao {
    @Insert("INSERT INTO abilityscore (characterId,strength,dexterity,constitution,intelligence,wisdom,charisma) VALUES " +
            "(#{characterId},#{strength},#{dexterity},#{constitution},#{intelligence},#{wisdom},#{charisma})")
    public int addAbilityScore(AbilityScore abilityScore);//新增角色属性值
}
