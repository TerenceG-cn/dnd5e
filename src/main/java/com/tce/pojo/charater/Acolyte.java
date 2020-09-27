package com.tce.pojo.charater;

import com.tce.fixed_enum.Ideals;
import com.tce.fixed_enum.Skills;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 背景：侍僧
 */
public class Acolyte extends Background{

    /**
     * 可选特点
     */
    public static final Map<Integer,String> CHARACTERISTICS=new HashMap<>();
    /**
     * 可选羁绊
     */
    public static final Map<Integer,String> BOUNDS=new HashMap<>();
    /**
     * 可选缺点
     */
    public static final Map<Integer,String> FLOWS=new HashMap<>();

    static {
        CHARACTERISTICS.put(1, "我崇个某个英雄，并时刻以其事迹作为榜样");
        CHARACTERISTICS.put(2,"我能在最狂乱的敌人间寻找，然后感化他们一同为和平而努力");
        CHARACTERISTICS.put(3,"我在每个事件和行动中看到预兆。神试图对我们说话，我们只需要听即可");
        CHARACTERISTICS.put(4,"没有什么能动摇我的乐观态度");
        CHARACTERISTICS.put(5,"我任何情况下都喜欢引用（或错引）圣典格言");
        CHARACTERISTICS.put(6,"我能容忍（或无法容忍）其它信仰并且尊重（或谴责）对其他神祗的崇拜");
        CHARACTERISTICS.put(7,"我喜爱美食、饮料以及同信仰神庙中的精英分子们的高层圈子；粗野的生活令我烦躁");
        CHARACTERISTICS.put(8,"我在神庙中活的太久了，以至于我在与外面世界的人们打交道时缺乏实际经验");

        BOUNDS.put(1,"为找回很久前丢失与我信仰有关的一件古代遗物，我可以付出生命");
        BOUNDS.put(2,"终有一天我会对谴责我为异端的罪恶神庙组织复仇");
        BOUNDS.put(3,"我欠那位在我的双亲死亡时收养我的教士一条命");
        BOUNDS.put(4,"我做的每一件事情都是为了普罗大众");
        BOUNDS.put(5,"为了保卫我曾服务的神庙我可以做任何事情");
        BOUNDS.put(6,"我试图取保护一部神圣典籍，而我的敌人认为它是异端的并寻找摧毁它");

        FLOWS.put(1,"我评价他人十分严苛，并且对自己更加苛刻");
        FLOWS.put(2,"我过于信任那些在我神庙的阶级中控制权势的人");
        FLOWS.put(3,"我的虔诚有时令我盲目信任那些声称与我信仰相同的人");
        FLOWS.put(4,"我思想呆板僵化，不懂变通");
        FLOWS.put(5,"我会怀疑陌生人并将他们想成最坏的情况");
        FLOWS.put(6,"一旦我选择了一个目标，就会变得执迷于它以至于因此损害自己生命中的所有其他事物");
    }


    /**
     * 特点
     */
    private String characteristic;
    /**
     * 理想
     */
    private String ideal;
    /**
     * 牵绊，羁绊
     */
    private String bound;
    /**
     * 缺点
     */
    private String flow;

    public Acolyte(String languages1,String languages2){
        this(languages1,languages2,randomCharacteristic(),randomIdeal(),randomBound(),randomFlow());
    }

    public Acolyte(String languages1,String languages2,String characteristic,String ideal,String bound,String flow){
        super("侍僧");
        //技能熟练项：洞悉，宗教
        this.addProficiencie(Skills.INSIGHT);
        this.addProficiencie(Skills.RELIGION);
        //装备
        this.addEquipment("圣辉（出任神职时的礼物）",1);
        this.addEquipment("祷告经书",1);
        this.addEquipment("熏香",5);
        this.addEquipment("祭袍",1);
        this.addEquipment("普通衣物",1);
        this.addEquipment("腰包（装有15gp）",1);
        //任选两门语言
        this.addLanguage(languages1);
        this.addLanguage(languages2);
        //选择特点
        this.setCharacteristic(characteristic);
        //选择理想
        this.setIdeal(ideal);
        //选择牵绊
        this.setBound(bound);
        //选择缺点
        this.setFlow(flow);
    }

    public String getBound() {
        return bound;
    }

    public void setBound(String bound) {
        this.bound = bound;
    }

    public String getFlow() {
        return flow;
    }

    public void setFlow(String flow) {
        this.flow = flow;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getIdeal() {
        return ideal;
    }

    public void setIdeal(String ideal) {
        this.ideal = ideal;
    }

    private static String randomCharacteristic(){
        Random random=new Random();
        int i=random.nextInt(CHARACTERISTICS.size())%CHARACTERISTICS.size()+1;
        return CHARACTERISTICS.get(i);
    }

    private static String randomIdeal(){
        Random random=new Random();
        int len=Ideals.values().length;
        int i=random.nextInt(len)%len+1;
        return Ideals.values()[i].toString();
    }
    private static String randomBound(){
        Random random=new Random();
        int i=random.nextInt(BOUNDS.size())%BOUNDS.size()+1;
        return BOUNDS.get(i);
    }
    private static String randomFlow(){
        Random random=new Random();
        int i=random.nextInt(FLOWS.size())%FLOWS.size()+1;
        return FLOWS.get(i);
    }

    @Override
    public String toString(){
        return "Acolyte{"+
                "bgName=" + this.getBgName() +
                ", languages='" + this.getLanguages() +
                ", proficiencies='" + this.getProficiencies() +
                ", equipments=" + this.getEquipments() +
                ", characteristic=" + characteristic +
                ", bound=" + bound +
                ", flow=" + flow +
                ", ideal=" + ideal +
                '}';
    }
    public static void main(String[] args) {
        Acolyte acolyte=new Acolyte("l1","l2");
        System.out.println(acolyte.toString());
    }
}
