package com.tce.pojo.treasures;

public class MagicItems {
    private Integer id;//��������
    private String en_name;
    private String cn_name;
    /**ϡ�жȣ�����magic_item_rarity*/
    private String rarity;
    /**��𣺻��ף�ħҩ����ָ��Ȩ�ȣ����ᣬ���ȣ�ħ�ȣ�����������*/
    private String categories;
    /**�Ƿ���Ҫͬ��
     * һЩħ����Ʒ��Ҫһ���������Լ��γ�ĳ����������
     * ʹ����ħ�����ԡ����ֳ�Ϊͬ�� attunement ������ͨ������
     * ĳЩ�Ⱦ����������ͬ��ĳ��ħ����Ʒ���Ⱦ�������ĳ��ְ
     * ҵ�����������Ʒͬ������������Ǹ�ְҵ������֮����
     * ͬ���������ְҵ����Ϊʩ��ְҵ����ӵ�з���λ��ʹ����Ӧ
     * ְҵ�����б�Ĺ���Ҳ�߱���֮ͬ�����ʸ�
     *
     * δ����Ʒ���ͬ��������ֻ��ʹ�ø���Ʒ�ķ�ħ�����棬
     * ������?������˵�������磬һ����Ҫͬ����ħ��������δ��
     * ֮ͬ�����������п�������Ϊһ���ħ���Ķ��ƣ�����ħ��
     * ���Ծ��޷���Ч��
     *
     * һ��������һ��ħ����Ʒͬ��ʱ����Ҫ�������ڶ����� ���
     * ����Ʒ����רע��������֮����Ӵ����㲻����ͬһ��
     * ��������֪��ħ����Ʒ�����ԣ�������רע����ʽ����������
     * ѵ����������������ڤ�루��������������ʵ��Ļ��ʽ��
     * ������ݱ���ϣ������е�ͬ��Ҳ��ʧ�ܡ�����������ʱ��
     * �����ｫֱ���ԵĻ�֪��μ����ħ����Ʒ���������ԣ���
     * ������������κ������
     *
     * 	ͬһ��ħ����Ʒһ��ֻ����һ������ͬ������һ������
     * ����ͬʱ���������ϵ�ħ����Ʒͬ�������Ǹ���������ֹĳ
     * ����ͬ����Ʒ�����ᣬ��������ļ�ħ����Ʒ��ͬ���ض�ʧ
     * �ܡ����⣬һ�����ﲻ�������һ����ͬ��ħ����Ʒ����ͬ����
     * ���磬һ�����ﲻ������ö������ָ ring	of	protection ͬ����
     *
     * ���һ�����ﲻ������ͬ�����Ⱦ����������߸���Ʒ��
     * �������� 100 �߲�ά������ 24 Сʱ���ֻ��߸�������������
     * һ���������Ʒ���ͬ����������ֹ��ǰ��ͬ�����ᡣ����Ҳ
     * ��������һ�ζ����ڼ����Ʒ����רע��������ֹͬ�����ᣬ
     * ���Ǹ���Ʒ�ܵ����䡣
     * */
    private Boolean attunement;
    /**����
     * ĳЩ�������ħ����Ʒ��������ʹ���ߣ���ʱ����ʹ��
     * �߲���ʹ�ø���ƷҲ���ںܳ�ʱ��������Ӱ�졣ħ����Ʒ��
     * ?���л���ϸ˵������Ʒ�Ƿ����䡣��ȻһЩ����ѧʶ��
     * ��?����Щ���䣬�������������Ʒ�ķ�������������������
     * identify�����޷���ʾ��Щ���䡣����Щ�����ЧӦ��¶ʱ��
     * ������������ʹ���߸е�ʮ�����⡣
     *
     * ��һ����������Ʒͬ������ͬ�����������䱻�Ƴ�ǰ��
     * ������ֹ���Ƴ�����ķ�ʽ֮һ���Ƕ���ʩչ�����Ƴ�����
     * remove	curse��*/
    private String curse;
    /**ר������
     * ������
     * 1.����ħ����Ʒ Identifying a Magic Item
     * 2.��װ�������Ʒ Wearing and WieldingItems������ͬ����Ʒ�ͳɶ���Ʒ
     * 3.������Ʒ�������������Ʒ
     * 4.����Spells
     * 5.����Charges
     * */
    private String special_features;
    /**ħ����Ʒ����*/
    private static final String RESILIENCE=
            "�����ħ����Ʒ���ǷǷ����յ���Ʒ�����ĵ��������\n" +
            "ħ��ǿ����ʹ��Щħ����Ʒ�������Ծ���ѷɫ�����Ƶķ�ħ\n" +
            "����Ʒ����ҩˮ�������Ĵ����ħ����Ʒ��������������\n" +
            "�����п��ԡ�����������᲻�ɴݣ���ֻ��ͨ��һЩ�����ֶ�\n" +
            "�����ƻ���";

    public MagicItems(){};
    public MagicItems(String en_name,String cn_name,String rarity,String categories,boolean attunement,String sf){
        this.en_name=en_name;this.cn_name=cn_name;this.rarity=rarity;
        this.categories=categories;this.attunement=attunement;this.special_features=sf;
    }

    /**�Դ�ħ����Ʒ TODO*/
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
