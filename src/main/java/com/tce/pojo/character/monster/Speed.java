package com.tce.pojo.character.monster;

public class Speed {

    private Long monsterId;
    /**
     * 速度(步行)
     */
    private Integer speed;//单位尺
    /**
     * 掘穴速度
     */
    private Integer burrow;
    /**
     * 攀爬速度
     */
    private Integer climb;
    /**
     * 飞行速度
     */
    private Integer fly;
    /**
     * 游泳速度
     */
    private int swim;

    public Long getMonsterId() {
        return monsterId;
    }

    public void setMonsterId(Long monsterId) {
        this.monsterId = monsterId;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getBurrow() {
        return burrow;
    }

    public void setBurrow(Integer burrow) {
        this.burrow = burrow;
    }

    public Integer getClimb() {
        return climb;
    }

    public void setClimb(Integer climb) {
        this.climb = climb;
    }

    public Integer getFly() {
        return fly;
    }

    public void setFly(Integer fly) {
        this.fly = fly;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }
}
