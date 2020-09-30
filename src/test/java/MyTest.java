import com.tce.common.fixed_enum.Skills;

public class MyTest {
//    public void fcn(int o){}
//    public int fcn(int o){} 只有返回值不同的方法 编译不通过
//    public static void main(String[] args){
//        String a="nmsl";
//        String b=a;
//        System.out.println(a+"\n"+b);
//        a="wsnd";
//        System.out.println(a+"\n"+b); 字符串不可变内容
//    }
//    public static void main(String[] args) throws Exception {
//        List<String> list = new ArrayList<String>();
//        Exception origin = null;
//        try {
//            System.out.println(Integer.parseInt("abc"));
//        } catch (Exception e) {
//            origin = e;
//            throw e;
//        } finally {
//            Exception e = new IllegalArgumentException();
//            if (origin != null) {
//                e.addSuppressed(origin);
//            }
//            throw e;
//        }
//    }
    public static void main(String[] args) throws Exception {
        System.out.println(Skills.valueOf("ATHLETICS").name());
        System.out.println(Skills.valueOf("ATHLETICS").ordinal());

    }
}
