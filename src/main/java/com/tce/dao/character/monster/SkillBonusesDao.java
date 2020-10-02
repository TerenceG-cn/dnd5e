package com.tce.dao.character.monster;


import com.tce.pojo.character.monster.SkillBonuses;
import org.apache.ibatis.annotations.Insert;

public interface SkillBonusesDao {
    @Insert("INSERT INTO skill(monsterId,athletics,acrobatics,sleightOfHand,stealth,arcana,history,religion,nature,investigation,insight,perception,animalHanding,medicine,survival,deception,persuation,intimidation,performance" +
            ") VALUE (#{monsterId},#{athletics},#{acrobatics},#{sleightOfHand},#{stealth},#{arcana},#{history},#{religion},#{nature},#{investigation},#{insight},#{perception},#{animalHanding},#{medicine},#{survival},#{deception},#{persuation},#{intimidation}，#{performance})")
    public int addSkill(SkillBonuses skill);
}
