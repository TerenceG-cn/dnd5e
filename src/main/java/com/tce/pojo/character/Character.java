package com.tce.pojo.character;

public class Character {
    private Long id;
    private Long monsterId;//NULL
    private Long pcId;//NULL
    private Long npcId;//NULL
    private String enName;
    private String cnName;
    /**属性值,一般情况下取值为范围0~20*/
    private Integer strength;       //力量
    private Integer dexterity;      //敏捷
    private Integer constitution;   //体质
    private Integer intelligence;   //智力
    private Integer wisdom;         //感知
    private Integer charisma;       //魅力
    /**阵营*/
    private String alignment;
    /**
     * 感官,尺
     */
    private Integer darkvision;         //黑暗视觉
    private Integer trueSight;          //真实视觉
    private Integer blindsight;         //盲视
    private Integer passivePerception;  //被动感知

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMonsterId() {
        return monsterId;
    }

    public void setMonsterId(Long monsterId) {
        this.monsterId = monsterId;
    }

    public Long getPcId() {
        return pcId;
    }

    public void setPcId(Long pcId) {
        this.pcId = pcId;
    }

    public Long getNpcId() {
        return npcId;
    }

    public void setNpcId(Long npcId) {
        this.npcId = npcId;
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

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getConstitution() {
        return constitution;
    }

    public void setConstitution(Integer constitution) {
        this.constitution = constitution;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getWisdom() {
        return wisdom;
    }

    public void setWisdom(Integer wisdom) {
        this.wisdom = wisdom;
    }

    public Integer getCharisma() {
        return charisma;
    }

    public void setCharisma(Integer charisma) {
        this.charisma = charisma;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
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
}
