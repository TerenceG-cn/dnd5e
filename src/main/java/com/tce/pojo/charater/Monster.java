package com.tce.pojo.charater;

public class Monster extends com.tce.pojo.charater.Character {
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
    /**����춨��ֵSavingThrowBonus*/


    /**����
     * ��������Ŀ�����ù�������ͨ��һ������ܡ����磬ĳ��
     * �����ڶ���������ʱ�����ж���ĸ�֪�����죩�����ݣ����䣩
     * �춨��ֵ��
     * �����ܼ춨��ֵ�ǹ���������Ե���ֵ����������ֵ���ܺͣ�
     * ���й����������ֵ�����ڹ������ս�ȼ���������ֵ���ڱ��
     * ����ս�ȼ���Ӧ������ֵ���У����ü�ֵ�����Լ��������ĵ���
     * ֵ����ʱ��������еĸ��߼�ֵ��ͨ��ʹ��˫����������ֵ����
     * ʾ����и��ߵ�רҵ������*/
    private Integer athletics;      //�˶����ܼ춨��ֵ���������

    private Integer acrobatics;     //��٣�����
    private Integer sleightOfHand;  //����
    private Integer stealth;        //����

    private Integer arcana;         //���أ�����
    private Integer history;        //��ʷ
    private Integer religion;       //�ڽ�
    private Integer nature;         //��Ȼ
    private Integer investigation;  //����

    private Integer insight;        //��Ϥ����֪
    private Integer perception;     //���
    private Integer animalHanding;  //ѱ��
    private Integer medicine;       //ҽҩ
    private Integer survival;       //����

    private Integer deception;      //����������
    private Integer persuation;     //��˵
    private Integer intimidation;   //��в
    private Integer performance;    //����

    /**����vulnerabilities*/
    private Boolean fireVulnerable;     //��������
    private Boolean frozenVulnerable;   //�䶳����
    private Boolean shiningVulnerable;  //��ҫ����
    private Boolean thunderVulnerable;  //��������
    private Boolean soulVulnerable;     //�������ˣ���ʵ�˺�
    private Boolean bludgeonVulnerable; //�ۻ�����
    private Boolean specialVulnerable;  //�������ˣ����������ɲ�������������������ħ�������Ĵ���
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
