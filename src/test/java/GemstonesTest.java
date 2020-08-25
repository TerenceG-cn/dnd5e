import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class GemstonesTest {
    public static void main(String[] args){
        try {String resource="mybatis-config.xml";
            InputStream is = Resources.getResourceAsStream(resource);//加载核心配置文件
            SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(is); //获得工厂对象

            SqlSession sqlSession=factory.openSession();  //获取核心对象

            /**getByName true -> selectOne*/
            /*已完成
            Gemstones gembyname=sqlSession.selectOne("getByName","蓝水晶");
            System.out.println(gembyname.toString());
            */

            /**getByValue true -> selectAll*/
            /*已完成
            List<Gemstones> gembyval=sqlSession.selectList("getByValue",10);
            for(Gemstones gem:gembyval){
                System.out.println(gem.toString());
            }
            */

            /**insertGem test true*/
            /*已完成添加宝石项
            Gemstones gem1=new Gemstones("azurite","蓝铜矿","深蓝色斑驳纹理不透明宝石",10);
            sqlSession.insert("insertGem", gem1);
             */


            /**updateGem test true，to do*/
            /*已完成 update 项，但是每次只能改一项
            Gemstones gemUpdate=new Gemstones();//gemUpdate.setCn_name("蓝铜矿");//gemUpdate.setValue(19);
            gemUpdate.setGem_description("灰黑色不透明宝石");
            gemUpdate.setId(4);
            int updateGem=sqlSession.update("updateGem",gemUpdate);//成功
            System.out.println(updateGem);
             */


            /*sqlSession.delete("deleteUser",31);待测试 TODO*/
            sqlSession.commit();  //修改数据库操作需要惊喜手动的事务提交(增删改)
            sqlSession.close();  //需要关闭sqlSession对象释放资源
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
