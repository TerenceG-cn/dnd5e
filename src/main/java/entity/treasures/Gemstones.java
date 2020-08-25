package entity.treasures;

/**
 * ��ʯʵ��
 * ���һ������Ĳ�Ʒ������ʯ���������ʹ�����б��
 * �������ֵ�����ѡ�����ҵ����Ǳ�ʯ���ࡣ������趨��
 * ��ֻ��һ�ֱ�ʯȻ��ֻ��һ�Σ����߶������������һ����
 * �����ֱ�ʯ�ı�ʯ�ѡ�
 */
public class Gemstones {
    private Integer id;//��������
    private String en_name;//azurite
    private String cn_name;//��ͭ��
    private String gem_description;//"����ɫ�߲�����͸����ʯ"
    private Integer value;//��ֵ10gp

    public Gemstones() {}

    public Gemstones(String en_name, String cn_name, String gem_description, int value) {
        this.en_name=en_name;
        this.cn_name=cn_name;
        this.gem_description=gem_description;
        this.value= value;
    }

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
                ", Ӣ������" + en_name  +
                ", ��������" + cn_name  +
                ", ��ʯ���ܣ�" + gem_description +
                ", ��ֵ��" + value + "gp"+
                '}';
    }
}
