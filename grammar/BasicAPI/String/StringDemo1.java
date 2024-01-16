package grammar.BasicAPI.String;

public class StringDemo1 {
    public static void main(String[] args) {
        //1.直接双引号得到字符串对象，封装字符串数据
        String name = "丁真";
        System.out.println(name);

        //2.new String创建字符串对象，并调用构造器初始化字符串
        String rs1 = new String();
        System.out.println(rs1);

        String rs2 = new String("雪豹");
        System.out.println(rs2);

        char[] chars = {'丁', '真'};
        String rs3 = new String(chars);
        System.out.println(rs3);

        //a，b，c的asc码
        byte[] bytes = {97, 98, 99};
        String rs4 = new String(bytes);
        System.out.println(rs4);
        
    }
}
