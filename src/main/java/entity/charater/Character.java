package entity.charater;

/**
 * 角色抽象类
 * 被怪物，玩家角色，NPC 继承
 */
public abstract class Character {
    private String en_name;
    private String cn_name;
    /**属性值,一般情况下取值为范围0~20*/
    private Integer strength;       //力量
    private Integer dexterity;      //敏捷
    private Integer intelligence;   //智力
    private Integer wisdom;         //感知
    private Integer charisma;       //魅力
    /**属性调整值*/
    private Integer str_mod;        //力量调整值
    private Integer dex_mod;        //敏捷调整值
    private Integer int_mod;        //智力调整值
    private Integer wis_mod;        //感知调整值
    private Integer cha_mod;        //魅力调整值

    /**调整值*/
    private int[]  abilityModifiers;
    /**阵营*/
    private String alignment;

    public Character(String en_name,String cn_name,int str,int dex,int intel,int wis,int chma,String ali){
        this.en_name=en_name;this.cn_name=cn_name;
        this.strength=str;this.dexterity=dex;this.intelligence=intel;this.wisdom=wis;this.charisma=chma;
        this.alignment=ali;
    }

    public String getEn_name() {
        return en_name;
    }

    public void setEn_name(String en_name) {
        this.en_name = en_name;
    }

    public String getCn_name() {
        return cn_name;
    }

    public void setCn_name(String cn_name) {
        this.cn_name = cn_name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
        this.str_mod=(strength-10)/2;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
        this.dex_mod=(dexterity-10)/2;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
        this.int_mod=(intelligence-10)/2;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
        this.wis_mod=(wisdom-10)/2;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
        this.cha_mod=(charisma-10)/2;
    }

    public int[] getAbilityModifiers() {
        return abilityModifiers;
    }

    public void setAbilityModifiers(int[] abilityModifiers) {
        this.abilityModifiers = abilityModifiers;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment= alignment;
    }

    public Integer getStr_mod() {
        return str_mod;
    }

    public Integer getDex_mod() {
        return dex_mod;
    }

    public Integer getInt_mod() {
        return int_mod;
    }

    public Integer getWis_mod() {
        return wis_mod;
    }

    public Integer getCha_mod() {
        return cha_mod;
    }
}
