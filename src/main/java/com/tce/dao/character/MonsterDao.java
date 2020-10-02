package com.tce.dao.character;

import com.tce.pojo.character.monster.Monster;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper
public interface MonsterDao {
    @Insert("INSERT INTO monster (id,enName,cnName,alignment,typeAndTags,size,hitDice,ac,hitPoints) VALUES " +
            "(#{id},#{enName},#{cnName},#{alignment},#{typeAndTags},#{size},#{hitDice},#{ac},#{hitPoints})")
    public int addMonster(Monster art);//新增怪物
}
