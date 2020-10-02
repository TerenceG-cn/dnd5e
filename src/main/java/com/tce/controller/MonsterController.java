package com.tce.controller;

import com.tce.common.json.JsonResult;
import com.tce.pojo.character.AbilityScore;
import com.tce.pojo.character.monster.*;

import com.tce.service.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/monster")
@Controller
public class MonsterController {
    @Autowired
    private MonsterService monsterService;

    @RequestMapping("/addMonster")
    @ResponseBody
    public JsonResult addMonster(Monster monster, AbilityScore as, DamageVulnerability dv,
                                 Resistance re, DamageImmunity di, Speed speed, SkillBonuses sb, ConditionImmunity ci, Senses se){
        return monsterService.addMonster(monster,as,dv,re,di,speed,sb,ci,se);
    }
}
