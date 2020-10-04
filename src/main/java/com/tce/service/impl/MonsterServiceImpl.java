package com.tce.service.impl;

import com.tce.common.json.JsonResult;
import com.tce.common.utils.CreateIDUtils;
import com.tce.dao.character.AbilityScoreDao;
import com.tce.dao.character.MonsterDao;
import com.tce.dao.character.monster.*;
import com.tce.pojo.character.AbilityScore;
import com.tce.pojo.character.monster.*;
import com.tce.service.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonsterServiceImpl implements MonsterService{
    @Autowired
    private MonsterDao monsterDao;
    @Autowired
    private AbilityScoreDao abilityScoreDao;
    @Autowired
    private DamageVulnerabilityDao damageVulnerabilityDao;
    @Autowired
    private ResistanceDao resistanceDao;
    @Autowired
    private DamageImmunityDao damageImmunityDao;
    @Autowired
    private SpeedDao speedDao;
    @Autowired
    private SkillBonusesDao skillBonusesDao;
    @Autowired
    private ConditionImmunityDao conditionImmunityDao;
    @Autowired
    private SensesDao sensesDao;




    @Override
    public JsonResult addMonster(Monster monster, AbilityScore as, DamageVulnerability dv, Resistance re,
                                 DamageImmunity di, Speed speed, SkillBonuses sb, ConditionImmunity ci, Senses se) {
        //随机生成怪物id Long
        long monsterId= CreateIDUtils.createMonsterId();
        monster.setId(monsterId);
        as.setCharacterId(monsterId);
        dv.setMonsterId(monsterId);
        re.setMonsterId(monsterId);
        di.setMonsterId(monsterId);
        speed.setMonsterId(monsterId);
        sb.setMonsterId(monsterId);
        ci.setMonsterId(monsterId);
        se.setMonsterId(monsterId);

        System.out.println(re.getMonsterId()+" "+re);
        int sql1=monsterDao.addMonster(monster);
        if(sql1<=0)
            return JsonResult.build(500,"添加怪物基本信息失败！");
        int sql2= abilityScoreDao.addAbilityScore(as);
        if(sql2<=0)
            return JsonResult.build(500,"添加怪物属性失败！");
        int sql3=damageVulnerabilityDao.addVulnerability(dv);
        if(sql3<=0)
            return JsonResult.build(500,"添加怪物易伤失败！");
        int sql4=resistanceDao.addResistance(re);
        if(sql4<=0)
            return JsonResult.build(500,"添加怪物抗性失败！");
        int sql5=damageImmunityDao.addDamgeImmunity(di);
        if(sql5<=0)
            return JsonResult.build(500,"添加怪物伤害免疫失败！");
        int sql6=speedDao.addSpeed(speed);
        if(sql6<=0)
            return JsonResult.build(500,"添加怪物速度失败！");
        int sql7=skillBonusesDao.addSkill(sb);
        if(sql7<=0)
            return JsonResult.build(500,"添加怪物技能检定加值失败！");
        int sql8=conditionImmunityDao.addConditionImmunity(ci);
        if(sql8<=0)
            return JsonResult.build(500,"添加怪物状态免疫失败！");
        int sql9=conditionImmunityDao.addConditionImmunity(ci);
        if(sql9<=0)
            return JsonResult.build(500,"添加怪物状态免疫失败！");
        int sql10=sensesDao.addSenses(se);
        if(sql10<=0)
            return JsonResult.build(500,"添加怪物感官失败！");

        return JsonResult.build(200,"添加怪物成功！");
    }
}
