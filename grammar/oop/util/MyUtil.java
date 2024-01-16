package grammar.oop.util;

import java.util.Random;

//我的工具类，提高代码复用性，提高开发效率
//工具类中的方法都是类方法，每个类方法都是用来完成一个功能的
//用类方法设计，不用实例方法，实例方法需要创建对象来调用，对象会占内存
//类方法可以根据类名直接调用，也能节省内存，不需要创建对象
public class MyUtil {
    //私有化构造器，不让外部创建工具类对象（工具类没有必要创建对象）
    private MyUtil() {

    }

    public static String createCode(int n) {
        //空字符串
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random r = new Random();
        for (int i = 0; i < n; i++) {
            //随机一个字符范围内的索引
            int index = r.nextInt(data.length());
            //根据索引去data中提取字符
            code += data.charAt(index);
        }
        return code;
    }
}
