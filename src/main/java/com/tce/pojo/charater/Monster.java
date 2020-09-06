package com.tce.pojo.charater;

public class Monster extends com.tce.pojo.charater.Character {
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
    /**豁免检定加值SavingThrowBonus*/


    /**技能
     * ·技能条目描述该怪物所精通的一项或多项技能。例如，某怪
     * 物善于洞察与隐匿时，具有额外的感知（洞察）和敏捷（隐匿）
     * 检定加值。
     * ·技能检定加值是怪物相关属性调整值与其熟练加值的总和，
     * 其中怪物的熟练加值决定于怪物的挑战等级（具体数值列于表格
     * “挑战等级对应熟练加值”中）。该加值还可以加入其他的调整
     * 值，此时，怪物具有的更高加值（通常使用双倍的熟练加值）表
     * 示其具有更高的专业技术。*/
    private Integer athletics;      //运动技能检定加值，力量相关

    private Integer acrobatics;     //体操，体质
    private Integer sleightOfHand;  //巧手
    private Integer stealth;        //隐匿

    private Integer arcana;         //奥秘，智力
    private Integer history;        //历史
    private Integer religion;       //宗教
    private Integer nature;         //自然
    private Integer investigation;  //调查

    private Integer insight;        //洞悉，感知
    private Integer perception;     //察觉
    private Integer animalHanding;  //驯兽
    private Integer medicine;       //医药
    private Integer survival;       //求生

    private Integer deception;      //期瞒，魅力
    private Integer persuation;     //游说
    private Integer intimidation;   //威胁
    private Integer performance;    //表演

    /**易伤vulnerabilities*/
    private Boolean fireVulnerable;     //火焰易伤
    private Boolean frozenVulnerable;   //冷冻易伤
    private Boolean shiningVulnerable;  //光耀易伤
    private Boolean thunderVulnerable;  //雷鸣易伤
    private Boolean soulVulnerable;     //心灵易伤，真实伤害
    private Boolean bludgeonVulnerable; //钝击易伤
    private Boolean specialVulnerable;  //特殊易伤，例如怪物罗刹，易伤由善良生物持用魔法武器的穿刺
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
