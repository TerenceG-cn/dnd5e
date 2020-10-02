package com.tce.service;

import com.tce.common.json.JsonResult;
import com.tce.pojo.character.AbilityScore;
import com.tce.pojo.character.monster.*;

public interface MonsterService {
    /**
     * 创建怪物
     * @param monster 怪物基本信息
     * @param as 属性
     * @param dv 易伤
     * @param re 抗性
     * @param di 伤害免疫
     * @param speed 速度
     * @param sb 技能加值
     * @param ci 状态免疫
     * @param se 感官
     * @return json格式页面响应
     */
    JsonResult addMonster(Monster monster, AbilityScore as, DamageVulnerability dv,
                          Resistance re, DamageImmunity di, Speed speed,SkillBonuses sb,ConditionImmunity ci,Senses se);
}
