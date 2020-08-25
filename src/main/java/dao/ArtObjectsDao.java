package dao;

import entity.treasures.ArtObjects;

import java.util.List;

public interface ArtObjectsDao {
    public List<ArtObjects> getByValue(int val);//���ݼ�ֵ��ѯ����Ʒ��Ϣ
    public ArtObjects getByName(String name);//�������Ʋ�ѯ��ʯ��Ϣ
    public int insertArt(ArtObjects art);//������ʯ
    public  int updateArt(ArtObjects art);//�޸ı�ʯ��Ϣ
    public  int deleteArt(Integer id);//ɾ����ʯ
}
