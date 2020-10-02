package com.tce.dao.character.monster;


import com.tce.pojo.character.monster.Resistance;
import org.apache.ibatis.annotations.Insert;

public interface ResistanceDao {
    @Insert("INSERT INTO resistance (fireResistance,shiningResistance,thunderResistance,soulResistance,bludResistance,punctureResistance,slashResistance) VALUES " +
            "(#{fireResistance},#{shiningResistance},#{thunderResistance},#{soulResistance},#{bludResistance},#{punctureResistance},#{slashResistance})")
    public int addResistance(Resistance resistance);
}
