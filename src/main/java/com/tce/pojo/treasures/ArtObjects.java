package com.tce.pojo.treasures;

/**
 * ����Ʒʵ��
 * ���һ������Ĳ�Ʒ��������Ʒ���������ʹ�����б�
 * �񲢰����ֵ�����ѡ�����ҵ�������Ʒ������Զ������
 * ��ȷ�������е�����Ʒ��Ʒ����ͬ��������Ҳ����ڶ����
 * ͬ������Ʒ��
 */
public class ArtObjects {
    private Integer id;//��������
    private String en_name;//ewer
    private String cn_name;//��ˮ��
    private Integer value;//��ֵ

    public ArtObjects(){}
    public ArtObjects(String en_name,String cn_name,int value){
        this.en_name=en_name;
        this.cn_name=cn_name;
        this.value=value;
    }

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
                ", Ӣ������" + en_name  +
                ", ��������" + cn_name  +
                ", ��ֵ��" + value + "gp"+
                '}';
    }
}
