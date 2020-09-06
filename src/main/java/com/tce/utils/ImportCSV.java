package com.tce.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 从csv文件中导入数据库工具类
 */
public class ImportCSV {
    // 读取CSV文件的静态方法，使用CSV文件的绝对文件路径作为函数参数
    public static Object[][] getTestData(String fileName) throws IOException {
        List<String[]> records = new ArrayList<String[]>();
        String record;
        // 设定UTF-8字符集，使用带缓冲区的字符输入流BufferedReader读取文件内容
        BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
        // file.readLine(); //跳过表头所在的行

        // 遍历数据行并存储在名为records的ArrayList中，每一行records中存储的对象为一个String数组
        while ((record = file.readLine()) != null) {
            String[] fields = record.split(",");
            records.add(fields);
        }
        // 关闭文件
        file.close();
        // 将存储测试数据的List转换为一个Object的二维数组
        Object[][] results = new Object[records.size()][];
        // 设置二位数组每行的值，每行是一个Object对象
        for (int i = 0; i < records.size(); i++) {
            results[i] = (Object[]) records.get(i);
        }
        return results;
    }

    public static void main(String[] args){
        /*已完成
        try {
            String resource="mybatis-config.xml";
            InputStream is = Resources.getResourceAsStream(resource);//加载核心配置文件
            SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(is); //获得工厂对象
            SqlSession sqlSession=factory.openSession();  //获取核心对象

            Object[][] res=getTestData("src\\main\\resources\\csv\\gemstones_dnd5e.csv");//读取csv文件
            for(int i=13;i<res.length;i++)
            {
                Gemstones gem =new Gemstones(res[i][1].toString(),res[i][2].toString(),res[i][3].toString(),Integer.parseInt(res[i][4].toString()));
                System.out.println(gem.toString());
                sqlSession.insert("insertGem", gem);//添加宝石项
            }
            sqlSession.commit();  //修改数据库操作需要惊喜手动的事务提交(增删改)
            sqlSession.close();  //需要关闭sqlSession对象释放资源
        } catch (IOException e) {
            e.printStackTrace();
        }
         */

    }
}
