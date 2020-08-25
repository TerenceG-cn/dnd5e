package entity.charater;

public class Monster extends Character{
    /**种类与附标*/
    private String typeAndTags;
    /**体型*/
    private String size;
//    /**生命骰*/
//    private Integer hitDice;
    /**护甲等级*/
    private Integer ac;
    /**生命值*/
    private Integer hitPoints;
    /**速度(步行)*/
    private Integer speed;//单位尺
    /**掘穴速度*/
    private Integer burrowSpeed;
    /**攀爬速度*/
    private Integer climbSpeed;
    /**飞行速度*/
    private Integer flySpeed;
    /**游泳速度*/
    private int swimSpeed;
    /**豁免检定saving throw
     * ·豁免检定加值是怪物相关属性调整值与其熟练加值的总和，
     * 其中怪物的熟练加值决定于怪物的挑战等级*/
    private Integer st_strength;    //力量豁免熟练加值
    private Integer st_dexterity;   //敏捷豁免熟练加值
    private Integer st_intelligence;//智力豁免熟练加值
    private Integer st_wisdom;      //感知豁免熟练加值
    private Integer st_charisma;    //魅力豁免熟练加值
    /**豁免检定加值SavingThrowBonus*/
    private Integer stb_strength;    //力量豁免检定加值
    private Integer stb_dexterity;   //敏捷豁免检定加值
    private Integer stb_intelligence;//智力豁免检定加值
    private Integer stb_wisdom;      //感知豁免检定加值
    private Integer stb_charisma;    //魅力豁免检定加值

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

    /**技能
     * ·技能条目描述该怪物所精通的一项或多项技能。例如，某怪
     * 物善于洞察与隐匿时，具有额外的感知（洞察）和敏捷（隐匿）
     * 检定加值。
     * ·技能检定加值是怪物相关属性调整值与其熟练加值的总和，
     * 其中怪物的熟练加值决定于怪物的挑战等级（具体数值列于表格
     * “挑战等级对应熟练加值”中）。该加值还可以加入其他的调整
     * 值，此时，怪物具有的更高加值（通常使用双倍的熟练加值）表
     * 示其具有更高的专业技术。*/
    private String skills;//TODO
    /**易伤*/
    private String vulnerabilities;//TODO

    /**挑战等级*/
    private Double challengeRating;
    //TODO
    public Monster(String en_name, String cn_name, int str, int dex, int intel, int wis, int chma, String ali) {
        super(en_name, cn_name, str, dex, intel, wis, chma, ali);
    }

    /**getter and setter TODO*/

    public static void main(String [] args){
        Monster monster = new Monster("nihao", "你好", 10, 10, 10, 10, 10, "中立善良");
        System.out.println(monster.getEn_name()); System.out.println(monster.getStrength());

    }
}
