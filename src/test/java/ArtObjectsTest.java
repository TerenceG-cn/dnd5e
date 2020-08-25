import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class ArtObjectsTest {
    public static void main(String[] args){
        try {String resource="mybatis-config.xml";
            InputStream is = Resources.getResourceAsStream(resource);//���غ��������ļ�
            SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(is); //��ù�������

            SqlSession sqlSession=factory.openSession();  //��ȡ���Ķ���

            /**getByName true -> selectOne*/
            /*�����
            ArtObjects artbyname=sqlSession.selectOne("getArtByName","statuette");
            System.out.println(artbyname.toString());
             */

            /**getByValue true -> selectAll*/
            /*
            List<ArtObjects> artbyval=sqlSession.selectList("getArtByValue",25);
            for(ArtObjects art:artbyval){
                System.out.println(art.toString());
            }
             */

            /**insertGem test true*/
            /*�������ӱ�ʯ��
            ArtObjects art=new ArtObjects("ewer","��ˮ��",25);
            sqlSession.insert("insertArt", art);
            ArtObjects art1=new ArtObjects("statuette","���ʵ���",25);
            sqlSession.insert("insertArt", art1);
            ArtObjects art2=new ArtObjects("bracelet","����С����",25);
            sqlSession.insert("insertArt", art2);
            ArtObjects art3=new ArtObjects("vestments","��˿֯�Ƶķ���",25);
            sqlSession.insert("insertArt", art3);
            ArtObjects art4=new ArtObjects("mask","����˿���Ƶĺ���������",25);
            sqlSession.insert("insertArt", art4);
            ArtObjects art5=new ArtObjects("chalice","��׺����˿��ͭ�ʾƱ�",25);
            sqlSession.insert("insertArt", art5);
            ArtObjects art6=new ArtObjects("dice","�ɶԵĹ�������",25);
            sqlSession.insert("insertArt", art6);
            ArtObjects art7=new ArtObjects("mirror","���ڲʻ�ľ���е�С����",25);
            sqlSession.insert("insertArt", art7);
            ArtObjects art8=new ArtObjects("handkerchief","�廨˿������",25);
            sqlSession.insert("insertArt", art8);
            ArtObjects art9=new ArtObjects("locket","���ﻭ�Ųʻ�Ф��Ľ�����׹��",25);
            sqlSession.insert("insertArt", art9);
             */

            /**updateArt test  TODO*/
            /**deleteArt test  TODO*/
            sqlSession.commit();  //�޸����ݿ������Ҫ��ϲ�ֶ��������ύ(��ɾ��)
            sqlSession.close();  //��Ҫ�ر�sqlSession�����ͷ���Դ
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
