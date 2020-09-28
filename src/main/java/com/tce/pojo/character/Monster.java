package com.tce.pojo.character;

public class Monster {
    private Long id;

    private Long resistanceId;//抗性，1：1 fk
    private Long savingthrowId;//豁免检定加值,1:1 fk
    private Long skillId;//技能检定加值,1:1 fk
    private Long vulunerabilityId;//易伤,1:1 fk

    /**
     * 种类与附标
     */
    private String typeAndTags;
    /**
     * 体型
     */
    private String size;
    /**
     * 生命骰
     */
    private Integer hitDice;
    /**
     * 护甲等级
     */
    private Integer ac;
    /**
     * 生命值
     */
    private Integer hitPoints;
    /**
     * 速度(步行)
     */
    private Integer speed;//单位尺
    /**
     * 掘穴速度
     */
    private Integer burrowSpeed;
    /**
     * 攀爬速度
     */
    private Integer climbSpeed;
    /**
     * 飞行速度
     */
    private Integer flySpeed;
    /**
     * 游泳速度
     */
    private int swimSpeed;




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

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getBurrowSpeed() {
        return burrowSpeed;
    }

    public void setBurrowSpeed(Integer burrowSpeed) {
        this.burrowSpeed = burrowSpeed;
    }

    public Integer getClimbSpeed() {
        return climbSpeed;
    }

    public void setClimbSpeed(Integer climbSpeed) {
        this.climbSpeed = climbSpeed;
    }

    public Integer getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(Integer flySpeed) {
        this.flySpeed = flySpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }
}
