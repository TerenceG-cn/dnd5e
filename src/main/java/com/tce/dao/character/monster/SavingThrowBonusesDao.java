package com.tce.dao.character.monster;


import com.tce.pojo.character.monster.SavingThrowBonuses;
import org.apache.ibatis.annotations.Insert;

public interface SavingThrowBonusesDao {
    @Insert("INSERT INTO savingthrowbonuses (monsterId,strengthSTB,dexteritySTB,constitutionSTB,intelligenceSTB,wisdomSTB,charismaSTB)" +
            "VALUES (#{monsetrId},#{strengthSTB},#{dexteritySTB},#{constitutionSTB},#{intelligenceSTB},#{wisdomSTB},#{charismaSTB})")
    public int addSavingthrow(SavingThrowBonuses savingthrow);
}

