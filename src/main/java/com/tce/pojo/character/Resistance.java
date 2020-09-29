package com.tce.pojo.character;

/**
 * 抗性
 */
public class Resistance {
    private Long monsterId;
    private Boolean fireResistance;     //火焰抗性
    private Boolean frozenResistance;   //冷冻抗性
    private Boolean shiningResistance;  //光耀抗性
    private Boolean thunderResistance;  //雷鸣抗性
    private Boolean soulResistance;     //心灵抗性
    private Boolean bludResistance;     //非魔法钝击抗性
    private Boolean punctureResistance; //穿刺抗性
    private Boolean slashResistance;    //挥砍抗性

    public Long getMonsterId() {
        return monsterId;
    }

    public void setMonsterId(Long monsterId) {
        this.monsterId = monsterId;
    }

    public Boolean getFireResistance() {
        return fireResistance;
    }

    public void setFireResistance(Boolean fireResistance) {
        this.fireResistance = fireResistance;
    }

    public Boolean getFrozenResistance() {
        return frozenResistance;
    }

    public void setFrozenResistance(Boolean frozenResistance) {
        this.frozenResistance = frozenResistance;
    }

    public Boolean getShiningResistance() {
        return shiningResistance;
    }

    public void setShiningResistance(Boolean shiningResistance) {
        this.shiningResistance = shiningResistance;
    }

    public Boolean getThunderResistance() {
        return thunderResistance;
    }

    public void setThunderResistance(Boolean thunderResistance) {
        this.thunderResistance = thunderResistance;
    }

    public Boolean getSoulResistance() {
        return soulResistance;
    }

    public void setSoulResistance(Boolean soulResistance) {
        this.soulResistance = soulResistance;
    }

    public Boolean getBludResistance() {
        return bludResistance;
    }

    public void setBludResistance(Boolean bludResistance) {
        this.bludResistance = bludResistance;
    }

    public Boolean getPunctureResistance() {
        return punctureResistance;
    }

    public void setPunctureResistance(Boolean punctureResistance) {
        this.punctureResistance = punctureResistance;
    }

    public Boolean getSlashResistance() {
        return slashResistance;
    }

    public void setSlashResistance(Boolean slashResistance) {
        this.slashResistance = slashResistance;
    }
}
