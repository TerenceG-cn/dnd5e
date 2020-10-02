package com.tce.pojo.treasures;

/**
 * 艺术品实体
 * 如果一个宝库的藏品包含艺术品，则你可以使用下列表
 * 格并按其价值来随机选定被找到的艺术品。你可以多次掷骰
 * 来确定宝库中的艺术品藏品。而同个宝库里也会存在多件相
 * 同的艺术品。
 */
public class ArtObjects {
    private Integer id;//自增主键
    private String en_name;//ewer
    private String cn_name;//银水壶
    private Integer value;//价值

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

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ArtObject{" +
                "id=" + id +
                ", 英文名：" + en_name  +
                ", 中文名：" + cn_name  +
                ", 价值：" + value + "gp"+
                '}';
    }
}
