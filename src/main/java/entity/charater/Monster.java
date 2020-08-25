package entity.charater;

public class Monster extends Character{
    /**�����븽��*/
    private String typeAndTags;
    /**����*/
    private String size;
//    /**������*/
//    private Integer hitDice;
    /**���׵ȼ�*/
    private Integer ac;
    /**����ֵ*/
    private Integer hitPoints;
    /**�ٶ�(����)*/
    private Integer speed;//��λ��
    /**��Ѩ�ٶ�*/
    private Integer burrowSpeed;
    /**�����ٶ�*/
    private Integer climbSpeed;
    /**�����ٶ�*/
    private Integer flySpeed;
    /**��Ӿ�ٶ�*/
    private int swimSpeed;
    /**����춨saving throw
     * ������춨��ֵ�ǹ���������Ե���ֵ����������ֵ���ܺͣ�
     * ���й����������ֵ�����ڹ������ս�ȼ�*/
    private Integer st_strength;    //��������������ֵ
    private Integer st_dexterity;   //���ݻ���������ֵ
    private Integer st_intelligence;//��������������ֵ
    private Integer st_wisdom;      //��֪����������ֵ
    private Integer st_charisma;    //��������������ֵ
    /**����춨��ֵSavingThrowBonus*/
    private Integer stb_strength;    //��������춨��ֵ
    private Integer stb_dexterity;   //���ݻ���춨��ֵ
    private Integer stb_intelligence;//��������춨��ֵ
    private Integer stb_wisdom;      //��֪����춨��ֵ
    private Integer stb_charisma;    //��������춨��ֵ

    public String getTypeAndTags() {
        return typeAndTags;
    }

    public void setTypeAndTags(String typeAndTags) {
        this.typeAndTags = typeAndTags;
    }

    public Integer getSt_strength() {
        return st_strength;
    }

    public void setSt_strength(Integer st_strength) {
        this.st_strength = st_strength;
        this.stb_strength = this.getStr_mod()+st_strength;
    }

    public Integer getSt_dexterity() {
        return st_dexterity;
    }

    public void setSt_dexterity(Integer st_dexterity) {
        this.st_dexterity = st_dexterity;
        this.stb_dexterity = this.getDex_mod()+st_dexterity;
    }

    public Integer getSt_intelligence() {
        return st_intelligence;
    }

    public void setSt_intelligence(Integer st_intelligence) {
        this.st_intelligence = st_intelligence;
        this.stb_intelligence=this.getInt_mod()+ st_intelligence;
    }

    public Integer getSt_wisdom() {
        return st_wisdom;
    }

    public void setSt_wisdom(Integer st_wisdom) {
        this.st_wisdom = st_wisdom;
        this.stb_wisdom= this.getWis_mod()+st_wisdom;
    }

    public Integer getSt_charisma() {
        return st_charisma;
    }

    public void setSt_charisma(Integer st_charisma) {
        this.st_charisma = st_charisma;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getStb_strength() {
        return stb_strength;
    }

    public void setStb_strength(Integer stb_strength) {
        this.stb_strength = stb_strength;
    }

    public Integer getStb_dexterity() {
        return stb_dexterity;
    }

    public void setStb_dexterity(Integer stb_dexterity) {
        this.stb_dexterity = stb_dexterity;
    }

    public Integer getStb_intelligence() {
        return stb_intelligence;
    }

    public void setStb_intelligence(Integer stb_intelligence) {
        this.stb_intelligence = stb_intelligence;
    }

    public Integer getStb_wisdom() {
        return stb_wisdom;
    }

    public void setStb_wisdom(Integer stb_wisdom) {
        this.stb_wisdom = stb_wisdom;
    }

    public Integer getStb_charisma() {
        return stb_charisma;
    }

    public void setStb_charisma(Integer stb_charisma) {
        this.stb_charisma = stb_charisma;
    }

    /**����
     * ��������Ŀ�����ù�������ͨ��һ������ܡ����磬ĳ��
     * �����ڶ���������ʱ�����ж���ĸ�֪�����죩�����ݣ����䣩
     * �춨��ֵ��
     * �����ܼ춨��ֵ�ǹ���������Ե���ֵ����������ֵ���ܺͣ�
     * ���й����������ֵ�����ڹ������ս�ȼ���������ֵ���ڱ��
     * ����ս�ȼ���Ӧ������ֵ���У����ü�ֵ�����Լ��������ĵ���
     * ֵ����ʱ��������еĸ��߼�ֵ��ͨ��ʹ��˫����������ֵ����
     * ʾ����и��ߵ�רҵ������*/
    private String skills;//TODO
    /**����*/
    private String vulnerabilities;//TODO

    /**��ս�ȼ�*/
    private Double challengeRating;
    //TODO
    public Monster(String en_name, String cn_name, int str, int dex, int intel, int wis, int chma, String ali) {
        super(en_name, cn_name, str, dex, intel, wis, chma, ali);
    }

    /**getter and setter TODO*/

    public static void main(String [] args){
        Monster monster = new Monster("nihao", "���", 10, 10, 10, 10, 10, "��������");
        System.out.println(monster.getEn_name()); System.out.println(monster.getStrength());

    }
}
