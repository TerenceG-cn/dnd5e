package com.tce.dao.character;

import com.tce.pojo.character.Monster;
import org.apache.ibatis.annotations.Insert;

public interface MonsterDao {
    @Insert("INSERT INTO monster (id,enName,cnName,alignment,typeAndTags,size,hitDice,ac,hitPoints,speed,burrowSpeed,climbSpeed,flySpeed,swimSpeed) VALUES " +
            "(#{id},#{enName},#{cnName},#{alignment},#{typeAndTags},#{size},#{hitDice},#{ac},#{hitPoints},#{speed},#{burrowSpeed},#{climbSpeed},#{flySpeed},#{swimSpeed})")
    public int addMonster(Monster art);//新增怪物
}
