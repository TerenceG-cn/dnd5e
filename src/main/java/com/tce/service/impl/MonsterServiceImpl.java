package com.tce.service.impl;

import com.tce.common.json.JsonResult;
import com.tce.common.utils.CreateIDUtils;
import com.tce.dao.character.MonsterDao;
import com.tce.pojo.character.AbilityScore;
import com.tce.pojo.character.monster.*;
import com.tce.service.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonsterServiceImpl implements MonsterService{
    @Autowired
    private MonsterDao monsterDao;


    @Override
    public JsonResult addMonster(Monster monster, AbilityScore as, DamageVulnerability dv, Resistance re, DamageImmunity di, Speed speed, SkillBonuses sb, ConditionImmunity ci, Senses se) {
        //随机生成怪物id Long
        long monsterId= CreateIDUtils.createMonsterId();
        monster.setId(monsterId);

        int flagMonster=monsterDao.addMonster(monster);
        //todo
        if(flagMonster<=0){
            //todo 其他表相关数据都要删除
            return JsonResult.build(500,"添加怪物基本信息失败！");
        }else{
            return JsonResult.build(200,"添加怪物基本信息成功！");
        }
    }
}
