package com.tce.pojo.character;
/**
 * 状态免疫Stauts Immunity，包括invisible隐身，unconscious昏迷，incapacitated瘫痪/丧失行动能力共15种状态
 */
public class ConditionImmunity {
    private Long monsterId;

    private Boolean blindedImmunity;            //目盲免疫
    private Boolean deafenedImmunity;           //失聪免疫
    private Boolean charmedImmunity;            //魅惑免疫
    private Boolean poisonedImmunity;           //中毒免疫
    private Boolean frightenedImmunity;         //恐慌免疫
    private Boolean exhaustedImmunity;          //力竭免疫
    private Boolean petrifiedImmunity;          //石化免疫
    private Boolean stunnedImmunity;            //震慑免疫
    private Boolean paralyzedImmunity;          //麻痹免疫
    private Boolean restrainedImmunity;         //束缚免疫
    private Boolean proneImmunity;              //倒地免疫
    private Boolean grappledImmunity;           //擒抱免疫

    public Long getMonsterId() {
        return monsterId;
    }

    public void setMonsterId(Long monsterId) {
        this.monsterId = monsterId;
    }

    public Boolean getBlindedImmunity() {
        return blindedImmunity;
    }

    public void setBlindedImmunity(Boolean blindedImmunity) {
        this.blindedImmunity = blindedImmunity;
    }

    public Boolean getDeafenedImmunity() {
        return deafenedImmunity;
    }

    public void setDeafenedImmunity(Boolean deafenedImmunity) {
        this.deafenedImmunity = deafenedImmunity;
    }

    public Boolean getCharmedImmunity() {
        return charmedImmunity;
    }

    public void setCharmedImmunity(Boolean charmedImmunity) {
        this.charmedImmunity = charmedImmunity;
    }

    public Boolean getPoisonedImmunity() {
        return poisonedImmunity;
    }

    public void setPoisonedImmunity(Boolean poisonedImmunity) {
        this.poisonedImmunity = poisonedImmunity;
    }

    public Boolean getFrightenedImmunity() {
        return frightenedImmunity;
    }

    public void setFrightenedImmunity(Boolean frightenedImmunity) {
        this.frightenedImmunity = frightenedImmunity;
    }

    public Boolean getExhaustedImmunity() {
        return exhaustedImmunity;
    }

    public void setExhaustedImmunity(Boolean exhaustedImmunity) {
        this.exhaustedImmunity = exhaustedImmunity;
    }

    public Boolean getPetrifiedImmunity() {
        return petrifiedImmunity;
    }

    public void setPetrifiedImmunity(Boolean petrifiedImmunity) {
        this.petrifiedImmunity = petrifiedImmunity;
    }

    public Boolean getStunnedImmunity() {
        return stunnedImmunity;
    }

    public void setStunnedImmunity(Boolean stunnedImmunity) {
        this.stunnedImmunity = stunnedImmunity;
    }

    public Boolean getParalyzedImmunity() {
        return paralyzedImmunity;
    }

    public void setParalyzedImmunity(Boolean paralyzedImmunity) {
        this.paralyzedImmunity = paralyzedImmunity;
    }

    public Boolean getRestrainedImmunity() {
        return restrainedImmunity;
    }

    public void setRestrainedImmunity(Boolean restrainedImmunity) {
        this.restrainedImmunity = restrainedImmunity;
    }

    public Boolean getProneImmunity() {
        return proneImmunity;
    }

    public void setProneImmunity(Boolean proneImmunity) {
        this.proneImmunity = proneImmunity;
    }

    public Boolean getGrappledImmunity() {
        return grappledImmunity;
    }

    public void setGrappledImmunity(Boolean grappledImmunity) {
        this.grappledImmunity = grappledImmunity;
    }
}
