package com.tce.pojo.character.monster;

public class Monster {
    private Long id;//需要特殊的id生成

    private String enName;
    private String cnName;
    /**
     * 体型
     */
    private String size;
    /**
     * 种类与附标
     */
    private String typeAndTags;
    /**
     * 阵营
     */
    private String alignment;

    /**属性值和调整值*/

    /**
     * 护甲等级
     */
    private Integer ac;
    /**
     * 生命值
     */
    private Integer hitPoints;
    private Integer hitDice;//分配的生命骰
    /**
     * 伤害抗性、免疫与易伤
     * DamageVulnerabilities, Resistances, and Immunities
     */

    /**攻击加值 Attack Bonuses todo*/
    /**伤害 todo*/

    /**豁免DC Save DC todo*/

    /**专有特质、动作和反应 Special Traits, Actions, and Reactions todo*/

    /**速度 Speed*/

    /**豁免检定加值 Saving Throw Bonuses*/

    /**
     * 挑战等级 todo
     */
    private Double challengeRating;
    private Integer experience;//经验

    /**技能加值 Skill Bonuses*/

    /**状态免疫 Condition Immunities*/

    /**感官 Senses*/

    /**语言 Languages todo*/





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

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeAndTags() {
        return typeAndTags;
    }

    public void setTypeAndTags(String typeAndTags) {
        this.typeAndTags = typeAndTags;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getHitDice() {
        return hitDice;
    }

    public void setHitDice(Integer hitDice) {
        this.hitDice = hitDice;
    }

    public Integer getAc() {
        return ac;
    }

    public void setAc(Integer ac) {
        this.ac = ac;
    }

    public Integer getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(Integer hitPoints) {
        this.hitPoints = hitPoints;
    }
}
