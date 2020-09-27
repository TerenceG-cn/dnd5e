package com.tce.pojo.charater;

import com.tce.fixed_enum.Skills;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * pc 背景类
 */
public class Background {
    private String bgName;//背景 称呼
    private List<Skills> proficiencies;//技能熟练项
    private List<String> languages;//语言
    private Map<String,Integer> equipments;//装备
    //建议特征 Suggested Characteristics
    //自定义背景 Customizing a Background

    public Background(){}
    public Background(String bgName){
        this.bgName=bgName;
        this.proficiencies=new ArrayList<>();
        this.languages=new ArrayList<>();
        this.equipments=new HashMap<>();
    }

    public String getBgName() {
        return bgName;
    }

    public void setBgName(String bgName) {
        this.bgName = bgName;
    }

    public List<Skills> getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(List<Skills> proficiencies) {
        this.proficiencies = proficiencies;
    }

    public void addProficiencies(List<Skills> proficiencies) {
        this.proficiencies.addAll(proficiencies);
    }
    public void addProficiencie(Skills proficiencie) {
        this.proficiencies.add(proficiencie);
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public void addLanguages(List<String> languages) {
        this.languages.addAll(languages);
    }

    public void addLanguage(String language) {
        this.languages.add(language);
    }

    public Map<String, Integer> getEquipments() {
        return equipments;
    }

    public void setEquipments(Map<String, Integer> equipments) {
        this.equipments = equipments;
    }

    public void addEquipments(Map<String, Integer> equipments) {
        this.equipments.putAll(equipments);
    }

    public void addEquipment(String equipment,int count) {
        this.equipments.put(equipment,count);
    }
}
