package com.tce.pojo.character;

/**
 * 感官 Senses
 */
public class Senses {
    /**
     * 感官,尺
     */
    private Long monsterId;
    private Integer darkvision;         //黑暗视觉
    private Integer tremorsense;        //颤动感知
    private Integer trueSight;          //真实视觉
    private Integer blindsight;         //盲视
    private Integer passivePerception;  //被动感知

    public Long getMonsterId() {
        return monsterId;
    }

    public void setMonsterId(Long monsterId) {
        this.monsterId = monsterId;
    }

    public Integer getDarkvision() {
        return darkvision;
    }

    public void setDarkvision(Integer darkvision) {
        this.darkvision = darkvision;
    }

    public Integer getTremorsense() {
        return tremorsense;
    }

    public void setTremorsense(Integer tremorsense) {
        this.tremorsense = tremorsense;
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
