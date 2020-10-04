package com.tce.pojo.character.monster;
/**
 * 伤害免疫invulnerability
 */
public class DamageImmunity {

    private Long monsterId;

    private Boolean eclipseInvulnerability;     //黯蚀伤害免疫
    private Boolean poisonInvulnerability;      //毒素伤害免疫
    private Boolean soulInvulnerability;        //心灵伤害免疫
    private Boolean fireInvulnerability;        //火焰伤害免疫
    private Boolean frozenInvulnerability;      //冷冻伤害免疫
    private Boolean lightningInvulnerability;   //闪电伤害免疫
    private Boolean thunderInvulnerability;     //雷鸣伤害免疫
    private Boolean bludInvulnerability;        //非魔法钝击伤害免疫
    private Boolean punctureInvulnerability;    //穿刺伤害免疫
    private Boolean slashInvulnerability;       //挥砍伤害免疫
    private Boolean acidInvulnerability;        //强酸伤害免疫

    public Long getMonsterId() {
        return monsterId;
    }

    public void setMonsterId(Long monsterId) {
        this.monsterId = monsterId;
    }

    public Boolean getEclipseInvulnerability() {
        return eclipseInvulnerability;
    }

    public void setEclipseInvulnerability(Boolean eclipseInvulnerability) {
        this.eclipseInvulnerability = eclipseInvulnerability;
    }

    public Boolean getPoisonInvulnerability() {
        return poisonInvulnerability;
    }

    public void setPoisonInvulnerability(Boolean poisonInvulnerability) {
        this.poisonInvulnerability = poisonInvulnerability;
    }

    public Boolean getSoulInvulnerability() {
        return soulInvulnerability;
    }

    public void setSoulInvulnerability(Boolean soulInvulnerability) {
        this.soulInvulnerability = soulInvulnerability;
    }

    public Boolean getFireInvulnerability() {
        return fireInvulnerability;
    }

    public void setFireInvulnerability(Boolean fireInvulnerability) {
        this.fireInvulnerability = fireInvulnerability;
    }

    public Boolean getFrozenInvulnerability() {
        return frozenInvulnerability;
    }

    public void setFrozenInvulnerability(Boolean frozenInvulnerability) {
        this.frozenInvulnerability = frozenInvulnerability;
    }

    public Boolean getLightningInvulnerability() {
        return lightningInvulnerability;
    }

    public void setLightningInvulnerability(Boolean lightningInvulnerability) {
        this.lightningInvulnerability = lightningInvulnerability;
    }

    public Boolean getThunderInvulnerability() {
        return thunderInvulnerability;
    }

    public void setThunderInvulnerability(Boolean thunderInvulnerability) {
        this.thunderInvulnerability = thunderInvulnerability;
    }

    public Boolean getBludInvulnerability() {
        return bludInvulnerability;
    }

    public void setBludInvulnerability(Boolean bludInvulnerability) {
        this.bludInvulnerability = bludInvulnerability;
    }

    public Boolean getPunctureInvulnerability() {
        return punctureInvulnerability;
    }

    public void setPunctureInvulnerability(Boolean punctureInvulnerability) {
        this.punctureInvulnerability = punctureInvulnerability;
    }

    public Boolean getSlashInvulnerability() {
        return slashInvulnerability;
    }

    public void setSlashInvulnerability(Boolean slashInvulnerability) {
        this.slashInvulnerability = slashInvulnerability;
    }

    public Boolean getAcidInvulnerability() {
        return acidInvulnerability;
    }

    public void setAcidInvulnerability(Boolean acidInvulnerability) {
        this.acidInvulnerability = acidInvulnerability;
    }
}
