package grammar.BasicAPI.String;

public class StringMethod {
    public static void main(String[] args) {
        String s = "java";

        //1.s.length()
        //获取字符串长度
        System.out.println(s.length());

        //2.s.charAt()
        //提取字符串中某个索引位置的字符
        char c = s.charAt(1);
        System.out.println(c);

        //字符串的遍历
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println(ch);
        }

        System.out.println("--------------");

        //3.s.toCharArray()
        //把字符串转化成字符数组再遍历
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        //4.s1.equals(s2)
        //判断字符串内容，内容一样就返回true
        String s1 = new String("丁真");
        String s2 = new String("丁真");
        System.out.println(s1 == s2);   //false，因为s1、s2中存的是两个不同对象的地址
        System.out.println(s1.equals(s2));  //true，逐个比对s1与s2

        //5.s1.equalsIgnoreCase(s2)
        //忽略大小写比较字符串内容
        String c1 = "34AeFG";
        String c2 = "34aEfg";
        System.out.println(c1.equals(c2));  //false
        System.out.println(c1.equalsIgnoreCase(c2));    //true

        //6.s.substring(begin, end)
        //截取字符串内容
        String s3 = "java是最好的编程语言之一";
        //要注意的是，substring包前不包后
        //如下一行代码中，截取的内容包括第0个，但不包括第12个
        String rs = s3.substring(0, 12);
        System.out.println(rs);

        //7.s.substring(begin)
        //从当前索引位置一直截取到字符串末尾，且包含传入的索引位置
        String rs2 = s3.substring(5);
        System.out.println(rs2);

        //8.s.replace(target, replacement)
        //把字符串中的某个内容替换成新的内容，并返回新的字符串对象
        String info = "这个电影简直是个垃圾，垃圾电影！！";
        String rs3 = info.replace("垃圾", "**");
        System.out.println(rs3);

        //9.s.contains()
        //判断字符串中是否包含某个关键字
        String info2 = "java是世界上最好的编程语言";
        System.out.println(info2.contains("java")); //true
        System.out.println(info2.contains("JAVA")); //false

        //10.s.startWith()
        //判断字符串是否以某个字符串开头
        String rs4 = "丁真";
        System.out.println(rs4.startsWith("丁"));
        System.out.println(rs4.startsWith("丁真"));

        //11.s.split()
        //把字符串按照某指定内容分割成多个字符串，放到一个字符串数组中返回
        String rs5 = "丁真,陈泽,张维为,神鹰哥";
        String[] names = rs5.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
