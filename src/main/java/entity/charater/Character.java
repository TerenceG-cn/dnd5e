package entity.charater;

/**
 * ��ɫ������
 * �������ҽ�ɫ��NPC �̳�
 */
public abstract class Character {
    private String en_name;
    private String cn_name;
    /**����ֵ*/
    private int strength;//����
    private int dexterity;//����
    private int intelligence;//����
    private int wisdom;//��֪
    private int charisma;//����
    /**����ֵ*/
    private int[]  abilityModifiers;
    /**��Ӫ*/
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
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
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
}
