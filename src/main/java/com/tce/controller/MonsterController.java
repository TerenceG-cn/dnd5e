package com.tce.controller;

import com.tce.pojo.character.Monster;

import com.tce.pojo.character.SkillBonuses;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/monster")
public class MonsterController {
    @RequestMapping("/addMonster")
    @ResponseBody
    public String addMonster(Monster monster,SkillBonuses skill){
        System.out.println("nmsl");
        System.out.println(monster.getAc());
        System.out.println(monster.getId());

        System.out.println(skill.getAcrobatics());
        return null;
    }
}
