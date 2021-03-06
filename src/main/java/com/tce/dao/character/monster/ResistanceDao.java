package com.tce.dao.character.monster;


import com.tce.pojo.character.monster.Resistance;
import org.apache.ibatis.annotations.Insert;

public interface ResistanceDao {
    @Insert("INSERT INTO resistance (monsterId,fireResistance,shiningResistance,thunderResistance,soulResistance,bludResistance,punctureResistance,slashResistance) VALUES " +
            "(#{monsterId},#{fireResistance},#{shiningResistance},#{thunderResistance},#{soulResistance},#{bludResistance},#{punctureResistance},#{slashResistance})")
    public int addResistance(Resistance resistance);
}
