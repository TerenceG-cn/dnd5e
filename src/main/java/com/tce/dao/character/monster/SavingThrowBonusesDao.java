package com.tce.dao.character.monster;


import com.tce.pojo.character.SavingThrowBonuses;
import org.apache.ibatis.annotations.Insert;

public interface SavingThrowBonusesDao {
    @Insert("INSERT INTO savingthrow (monsterId,strengthSTB,dexteritySTB,constitutionSTB,intelligenceSTB,wisdomSTB,charismaSTB)" +
            "VALUES (#{monsetrId},#{strengthSTB},#{dexteritySTB},#{constitutionSTB},#{intelligenceSTB},#{wisdomSTB},#{charismaSTB})")
    public int addSavingthrow(SavingThrowBonuses savingthrow);
}

