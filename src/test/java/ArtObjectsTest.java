import com.tce.pojo.treasures.ArtObjects;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class ArtObjectsTest {
    public static void main(String[] args){
        try {String resource="mybatis-config.xml";
            InputStream is = Resources.getResourceAsStream(resource);//加载核心配置文件
            SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(is); //获得工厂对象

            SqlSession sqlSession=factory.openSession();  //获取核心对象

            /**getByName true -> selectOne*/
            //已完成
            ArtObjects artbyname=sqlSession.selectOne("getArtByName","statuette");
            System.out.println(artbyname.toString());


            /**getByValue true -> selectAll*/
            /*
            List<ArtObjects> artbyval=sqlSession.selectList("getArtByValue",25);
            for(ArtObjects art:artbyval){
                System.out.println(art.toString());
            }
             */

            /**insertGem test true*/
            /*已完成添加宝石项
            ArtObjects art=new ArtObjects("ewer","银水壶",25);
            sqlSession.insert("insertArt", art);
            ArtObjects art1=new ArtObjects("statuette","骨质雕像",25);
            sqlSession.insert("insertArt", art1);
            ArtObjects art2=new ArtObjects("bracelet","金质小手镯",25);
            sqlSession.insert("insertArt", art2);
            ArtObjects art3=new ArtObjects("vestments","金丝织制的法衣",25);
            sqlSession.insert("insertArt", art3);
            ArtObjects art4=new ArtObjects("mask","由银丝缝制的黑天鹅绒面具",25);
            sqlSession.insert("insertArt", art4);
            ArtObjects art5=new ArtObjects("chalice","点缀着银丝的铜质酒杯",25);
            sqlSession.insert("insertArt", art5);
            ArtObjects art6=new ArtObjects("dice","成对的骨质骰子",25);
            sqlSession.insert("insertArt", art6);
            ArtObjects art7=new ArtObjects("mirror","想在彩绘木框中的小镜子",25);
            sqlSession.insert("insertArt", art7);
            ArtObjects art8=new ArtObjects("handkerchief","绣花丝绸手帕",25);
            sqlSession.insert("insertArt", art8);
            ArtObjects art9=new ArtObjects("locket","内里画着彩绘肖像的金质链坠盒",25);
            sqlSession.insert("insertArt", art9);
             */

            /**updateArt test  TODO*/
            /**deleteArt test  TODO*/
            sqlSession.commit();  //修改数据库操作需要惊喜手动的事务提交(增删改)
            sqlSession.close();  //需要关闭sqlSession对象释放资源
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
