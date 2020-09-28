package com.tce.javabean.charater;

/**
 * 角色抽象类
 * 被怪物，玩家角色，NPC 继承
 */
public abstract class AbstractCharacter implements Character{
    private String enName;
    private String cnName;
    /**属性值,一般情况下取值为范围0~20*/
    private Integer strength;       //力量
    private Integer dexterity;      //敏捷
    private Integer intelligence;   //智力
    private Integer wisdom;         //感知
    private Integer charisma;       //魅力
//    /**属性调整值*/
//    private Integer str_mod;        //力量调整值
//    private Integer dex_mod;        //敏捷调整值
//    private Integer int_mod;        //智力调整值
//    private Integer wis_mod;        //感知调整值
//    private Integer cha_mod;        //魅力调整值

//    /**调整值*/
//    private int[]  abilityModifiers;
    /**阵营
     * 1.守序善良 4.守序中立 7.守序邪恶
     *
     * 2.中立善良 5.绝对中立 8.中立邪恶
     *
     * 3.混乱善良 6.混乱中立 9.混乱邪恶
     *
     * 10.无阵营
     */
    private String alignment;

    /**
     * 感官,尺
     */
    private Integer darkvision;//黑暗视觉
    private Integer trueSight;//真实视觉
    private Integer blindsight;//盲视
    private Integer passivePerception;//被动感知

    /**
     * 语言
     */
    private String language;

    public AbstractCharacter(String en_name,String cn_name,int str,int dex,int intel,int wis,int chma,String ali){
        this.enName=en_name;this.cnName=cn_name;
        this.strength=str;this.dexterity=dex;this.intelligence=intel;this.wisdom=wis;this.charisma=chma;
        this.alignment=ali;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment= alignment;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public void setWisdom(Integer wisdom) {
        this.wisdom = wisdom;
    }

    public void setCharisma(Integer charisma) {
        this.charisma = charisma;
    }

    public Integer getDarkvision() {
        return darkvision;
    }

    public void setDarkvision(Integer darkvision) {
        this.darkvision = darkvision;
    }

    public Integer getTrueSight() {
        return trueSight;
    }

    public void setTrueSight(Integer trueSight) {
        this.trueSight = trueSight;
    }

    public Integer getBlindsight() {
        return blindsight;
    }

    public void setBlindsight(Integer blindsight) {
        this.blindsight = blindsight;
    }

    public Integer getPassivePerception() {
        return passivePerception;
    }

    public void setPassivePerception(Integer passivePerception) {
        this.passivePerception = passivePerception;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
