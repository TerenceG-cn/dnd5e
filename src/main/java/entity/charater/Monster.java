package entity.charater;

public class Monster extends Character{
    /**�����븽��*/
    private String typeAndTags;
    /**����*/
    private String size;
    /**������*/
    private int hitDice;
    /**���׵ȼ�*/
    private int ac;
    /**����ֵ*/
    private int hitPoints;
    /**�ٶ�(����)*/
    private int speed;//��λ��
    /**��Ѩ�ٶ�*/
    private int burrowSpeed;
    /**�����ٶ�*/
    private int climbSpeed;
    /**�����ٶ�*/
    private int flySpeed;
    /**��Ϸ�ٶ�*/
    private int swimSpeed;
    /**����춨*/
    private String savingThrows;//TODO
    /**����*/
    private String skills;//TODO
    /**����*/
    private String vulnerabilities;//TODO
    //TODO
    public Monster(String en_name, String cn_name, int str, int dex, int intel, int wis, int chma, String ali) {
        super(en_name, cn_name, str, dex, intel, wis, chma, ali);
    }
}
