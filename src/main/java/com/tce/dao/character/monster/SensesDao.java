package com.tce.dao.character.monster;

import com.tce.pojo.character.monster.Senses;
import org.apache.ibatis.annotations.Insert;

public interface SensesDao {
    @Insert("INSERT INTO senses (monsterid,darkvison,tremorsense,trueSight,blindsight,passivePerception) " +
            "VALUES (#{monsterid},#{darkvison},#{tremorsense},#{trueSight},#{intelligenceSTB},#{blindsight},#{passivePerception})")
    public int addSenses(Senses senses);
}
