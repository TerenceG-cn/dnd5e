package com.tce.dao.character;

import com.tce.pojo.character.Character;
import org.apache.ibatis.annotations.Insert;
@Deprecated
public interface CharacterDao {
    @Insert("INSERT INTO character (monsterId,pcId,npcId,enName,cnName,strength,dexterity,constitution,intelligence,wisdom,charisma,alignment,darkvision,trueSight,blindsight,passivePerception) VALUES " +
            "(#{monsterId},#{pcId},#{npcId},#{enName},#{cnName},#{strength},#{dexterity},#{constitution},#{intelligence},#{wisdom},#{charisma},#{alignment},#{darkvision},#{trueSight},#{blindsight},#{passivePerception})")
    public int addCharacter(Character character);//新增角色
}
