package com.tce.dao.character.monster;

import com.tce.pojo.character.monster.Speed;
import org.apache.ibatis.annotations.Insert;

public interface SpeedDao {
    @Insert("INSERT INTO speed (monstrId,speed,burrow,climb,fly,swim) VALUES (#{monstrId},#{speed},#{burrow},#{climb},#{fly},#{swim})")
    public int addSpeed(Speed speed);
}
