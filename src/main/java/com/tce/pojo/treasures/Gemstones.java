package com.tce.pojo.treasures;

/**
 * 宝石实体
 * 如果一个宝库的藏品包含宝石，则你可以使用下列表格
 * 并按其价值来随机选定被找到的是宝石种类。你可以设定其
 * 内只有一种宝石然后只骰一次，或者多次掷骰来创造一个包
 * 含多种宝石的宝石堆。
 */
public class Gemstones {
    private Integer id;//自增主键
    private String en_name;//azurite
    private String cn_name;//蓝铜矿
    private String gem_description;//"深蓝色斑驳纹理不透明宝石"
    private Integer value;//价值10gp

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCn_name() {
        return cn_name;
    }

    public void setCn_name(String cn_name) {
        this.cn_name = cn_name;
    }

    public String getGem_description() {
        return gem_description;
    }

    public void setGem_description(String gem_description) {
        this.gem_description = gem_description;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getEn_name() {
        return en_name;
    }

    public void setEn_name(String en_name) {
        this.en_name = en_name;
    }

    @Override
    public String toString() {
        return "Gem{" +
                "id=" + id +
                ", 英文名：" + en_name  +
                ", 中文名：" + cn_name  +
                ", 宝石介绍：" + gem_description +
                ", 价值：" + value + "gp"+
                '}';
    }
}
