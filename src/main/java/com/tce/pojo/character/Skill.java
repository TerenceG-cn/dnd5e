package com.tce.pojo.character;

/**
 * 技能检定加值
 */
public class Skill {
    private Long id;
    private Integer athletics;      //运动技能检定加值，力量相关

    private Integer acrobatics;     //体操，体质
    private Integer sleightOfHand;  //巧手
    private Integer stealth;        //隐匿

    private Integer arcana;         //奥秘，智力
    private Integer history;        //历史
    private Integer religion;       //宗教
    private Integer nature;         //自然
    private Integer investigation;  //调查

    private Integer insight;        //洞悉，感知
    private Integer perception;     //察觉
    private Integer animalHanding;  //驯兽
    private Integer medicine;       //医药
    private Integer survival;       //求生

    private Integer deception;      //期瞒，魅力
    private Integer persuation;     //游说
    private Integer intimidation;   //威胁
    private Integer performance;    //表演

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAthletics() {
        return athletics;
    }

    public void setAthletics(Integer athletics) {
        this.athletics = athletics;
    }

    public Integer getAcrobatics() {
        return acrobatics;
    }

    public void setAcrobatics(Integer acrobatics) {
        this.acrobatics = acrobatics;
    }

    public Integer getSleightOfHand() {
        return sleightOfHand;
    }

    public void setSleightOfHand(Integer sleightOfHand) {
        this.sleightOfHand = sleightOfHand;
    }

    public Integer getStealth() {
        return stealth;
    }

    public void setStealth(Integer stealth) {
        this.stealth = stealth;
    }

    public Integer getArcana() {
        return arcana;
    }

    public void setArcana(Integer arcana) {
        this.arcana = arcana;
    }

    public Integer getHistory() {
        return history;
    }

    public void setHistory(Integer history) {
        this.history = history;
    }

    public Integer getReligion() {
        return religion;
    }

    public void setReligion(Integer religion) {
        this.religion = religion;
    }

    public Integer getNature() {
        return nature;
    }

    public void setNature(Integer nature) {
        this.nature = nature;
    }

    public Integer getInvestigation() {
        return investigation;
    }

    public void setInvestigation(Integer investigation) {
        this.investigation = investigation;
    }

    public Integer getInsight() {
        return insight;
    }

    public void setInsight(Integer insight) {
        this.insight = insight;
    }

    public Integer getPerception() {
        return perception;
    }

    public void setPerception(Integer perception) {
        this.perception = perception;
    }

    public Integer getAnimalHanding() {
        return animalHanding;
    }

    public void setAnimalHanding(Integer animalHanding) {
        this.animalHanding = animalHanding;
    }

    public Integer getMedicine() {
        return medicine;
    }

    public void setMedicine(Integer medicine) {
        this.medicine = medicine;
    }

    public Integer getSurvival() {
        return survival;
    }

    public void setSurvival(Integer survival) {
        this.survival = survival;
    }

    public Integer getDeception() {
        return deception;
    }

    public void setDeception(Integer deception) {
        this.deception = deception;
    }

    public Integer getPersuation() {
        return persuation;
    }

    public void setPersuation(Integer persuation) {
        this.persuation = persuation;
    }

    public Integer getIntimidation() {
        return intimidation;
    }

    public void setIntimidation(Integer intimidation) {
        this.intimidation = intimidation;
    }

    public Integer getPerformance() {
        return performance;
    }

    public void setPerformance(Integer performance) {
        this.performance = performance;
    }
}
