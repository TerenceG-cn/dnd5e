package com.tce.pojo.charater;

import com.tce.fixed_enum.Skills;

/**
 * 背景：侍僧
 */
public class Acolyte extends Background{

    public Acolyte(String languages1,String languages2){
        super("侍僧");
        //任选两门语言
        this.addLanguage(languages1);
        this.addLanguage(languages2);
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
    }

    private enum ideal{
        TRADITIONS, //传统 古代崇拜与献祭ङ传统必须保护并维持。(守序)
        CHARITY,    //仁爱 我总是试图帮助那些需要帮助的人，无论个人的花费如何。（善良）
        CHANGE,     //改变 我们必须协助引发神在世उ中一फ为之工作的改变。（混乱）
        POWER,      //权力 我希望有一天能够升格到所信仰宗教中等级的最高点。（守序）
        FAITH,      //信仰 我信任神祇能指引我ङ行为。我信奉如果自 己努力工作，事情就会变得顺利。（守序）
        ASPIRATION, //抱负 我将自己的行动与他或她的教导相较，求证明自己配得上吾主ङ喜爱。（任何）
    }

}
