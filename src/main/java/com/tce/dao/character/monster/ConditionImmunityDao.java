package com.tce.dao.character.monster;

import com.tce.pojo.character.monster.ConditionImmunity;
import org.apache.ibatis.annotations.Insert;


public interface ConditionImmunityDao {
    @Insert("INSERT INTO conditionimmunity(blindedImmunity,deafenedImmunity,charmedImmunity,poisonedImmunity," +
            "frightenedImmunity,exhaustedImmunity,petrifiedImmunity,stunnedImmunity,paralyzedImmunity,restrainedImmunity,proneImmunity,grappledImmunity) " +
            "VALUE (#{blindedImmunity},#{deafenedImmunity},#{charmedImmunity},#{poisonedImmunity}," +
            "#{frightenedImmunity},#{exhaustedImmunity},#{petrifiedImmunity},#{stunnedImmunity},#{paralyzedImmunity},#{restrainedImmunity},#{proneImmunity},#{grappledImmunity})")
    public int addConditionImmunity(ConditionImmunity conditionImmunity);
}
