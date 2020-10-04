package com.tce.dao.character.monster;

import com.tce.pojo.character.monster.DamageImmunity;
import org.apache.ibatis.annotations.Insert;

public interface DamageImmunityDao {
    @Insert("INSERT INTO damageimmunity (monsterId,eclipseInvulnerability,poisonInvulnerability,soulInvulnerability," +
            "fireInvulnerability,frozenInvulnerability,lightningInvulnerability,thunderInvulnerability,bludInvulnerability" +
            ",punctureInvulnerability,slashInvulnerability,acidInvulnerability) VALUE (#{monsterId},#{eclipseInvulnerability}," +
            "#{poisonInvulnerability},#{soulInvulnerability},#{fireInvulnerability},#{frozenInvulnerability}," +
            "#{lightningInvulnerability},#{thunderInvulnerability},#{bludInvulnerability},#{punctureInvulnerability}," +
            "#{slashInvulnerability},#{acidInvulnerability})")
    public int addDamgeImmunity(DamageImmunity damageImmunity);
}
