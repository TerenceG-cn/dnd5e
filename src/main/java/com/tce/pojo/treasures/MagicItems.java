package com.tce.pojo.treasures;

public class MagicItems {
    private Integer id;//自增主键
    private String en_name;
    private String cn_name;
    /**稀有度，附表magic_item_rarity*/
    private String rarity;
    /**类别：护甲，魔药，戒指，权杖，卷轴，法杖，魔杖，武器或奇物*/
    private String categories;
    /**是否需要同调
     * 一些魔法物品需要一个生物与自己形成某种联结后才能
     * 使用其魔法属性。这种称为同调 attunement 的联结通常还有
     * 某些先决条件。如果同调某件魔法物品的先决条件是某个职
     * 业，则尝试与该物品同调的生物必须是该职业才能与之进行
     * 同调。如果该职业限制为施法职业，而拥有法术位且使用相应
     * 职业法术列表的怪物也具备与之同调的资格。
     *
     * 未与物品完成同调的生物只能使用该物品的非魔法增益，
     * 除非其?述另有说明。比如，一面需要同调的魔法盾牌在未与
     * 之同调的生物手中可以用作为一面非魔法的盾牌，而其魔法
     * 属性均无法生效。
     *
     * 一个生物与一件魔法物品同调时，需要该生物在短休期 间对
     * 该物品进行专注并保持与之物理接触（你不能以同一次
     * 短休来获知该魔法物品的属性）。这种专注的形式可以是武器
     * 训练（用于武器），冥想（用于奇物）或其他适当的活动形式。
     * 如果短休被打断，所进行的同调也将失败。否则短休完成时，
     * 该生物将直觉性的获知如何激活该魔法物品的所有属性，包
     * 括其中所需的任何命令语。
     *
     * 	同一件魔法物品一次只能与一个生物同调，而一个生物
     * 不能同时与三件以上的魔法物品同调。除非该生物先终止某
     * 个已同调物品的联结，否则与第四件魔法物品的同调必定失
     * 败。此外，一个生物不能与多于一件相同的魔法物品进行同调。
     * 例如，一个生物不能与数枚防护戒指 ring	of	protection 同调。
     *
     * 如果一个生物不再满足同调的先决条件，或者该物品离
     * 开该生物 100 尺并维持至少 24 小时，又或者该生物死亡或另
     * 一生物与该物品完成同调，都将终止先前的同调联结。生物也
     * 可以利用一次短休期间对物品进行专注来主动终止同调联结，
     * 除非该物品受到诅咒。
     * */
    private Boolean attunement;
    /**诅咒
     * 某些被诅咒的魔法物品会困扰其使用者，有时甚至使用
     * 者不再使用该物品也会在很长时间里受其影响。魔法物品的
     * ?述中会详细说明该物品是否被诅咒。虽然一些逸闻学识中
     * 会?及这些诅咒，但大多数鉴定物品的方法（包括法术鉴定术
     * identify）都无法揭示这些诅咒。而这些诅咒的效应显露时，
     * 往往都会让其使用者感到十分意外。
     *
     * 与一件被诅咒物品同调后其同调联结在诅咒被破除前无
     * 法被终止，破除诅咒的方式之一便是对其施展法术移除诅咒
     * remove	curse。*/
    private String curse;
    /**专有特质
     * 包括：
     * 1.鉴定魔法物品 Identifying a Magic Item
     * 2.着装与持用物品 Wearing and WieldingItems：复数同类物品和成对物品
     * 3.激活物品：命令语和消耗品
     * 4.法术Spells
     * 5.充能Charges
     * */
    private String special_features;
    /**魔法物品自愈*/
    private static final String RESILIENCE=
            "大多数魔法物品都是非凡工艺的作品。精心的制作结合\n" +
            "魔法强化，使这些魔法物品的耐用性绝不逊色于相似的非魔\n" +
            "法物品。除药水与卷轴外的大多数魔法物品都对所有类型伤\n" +
            "害具有抗性。神器则尤其坚不可摧，而只能通过一些极端手段\n" +
            "才能破坏。";

    public MagicItems(){};
    public MagicItems(String en_name,String cn_name,String rarity,String categories,boolean attunement,String sf){
        this.en_name=en_name;this.cn_name=cn_name;this.rarity=rarity;
        this.categories=categories;this.attunement=attunement;this.special_features=sf;
    }

    /**自创魔法物品 TODO*/
    public static void createMagicItems(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public Boolean getAttunement() {
        return attunement;
    }

    public void setAttunement(Boolean attunement) {
        this.attunement = attunement;
    }

    public String getCurse() {
        return curse;
    }

    public void setCurse(String curse) {
        this.curse = curse;
    }

    public String getSpecial_features() {
        return special_features;
    }

    public void setSpecial_features(String special_features) {
        this.special_features = special_features;
    }
}
