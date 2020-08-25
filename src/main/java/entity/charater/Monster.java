package entity.charater;

public class Monster extends Character{
    /**种类与附标*/
    private String typeAndTags;
    /**体型*/
    private String size;
    /**生命骰*/
    private int hitDice;
    /**护甲等级*/
    private int ac;
    /**生命值*/
    private int hitPoints;
    /**速度(步行)*/
    private int speed;//单位尺
    /**掘穴速度*/
    private int burrowSpeed;
    /**攀爬速度*/
    private int climbSpeed;
    /**飞行速度*/
    private int flySpeed;
    /**游戏速度*/
    private int swimSpeed;
    /**豁免检定*/
    private String savingThrows;//TODO
    /**技能*/
    private String skills;//TODO
    /**易伤*/
    private String vulnerabilities;//TODO
    //TODO
    public Monster(String en_name, String cn_name, int str, int dex, int intel, int wis, int chma, String ali) {
        super(en_name, cn_name, str, dex, intel, wis, chma, ali);
    }
}
