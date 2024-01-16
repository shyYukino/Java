package grammar.oop.static_attention;

public class Student {
    //类变量
    static String schoolName;
    //实例变量
    double score;

    //1.类方法中可以直接访问类的成员，不可以直接访问实例成员
    //注意：类的成员包括类变量与类方法
    public static void printHelloWrold() {
        //在同一个类中，访问类成员，可以省略类名不写
        schoolName = "丁真";
        printHelloWorld2();

        //System.out.println(score); 会报错，在类中不可以访问实例变量
        //printPass(); 会报错，在类中不可以访问实例方法
    }

    //类方法
    public static void printHelloWorld2() {

    }

    //2.实例方法中既可以直接访问类成员，也可以访问实例成员
    //实例方法
    public void printPass() {
        //可以访问类变量
        schoolName = "丁真1";

        //可以访问类方法
        printHelloWorld2();

        //可以访问实例对象
        System.out.println(score);
        
        //可以调用实例方法
        printPass2();
    }

    //实例方法
    public void printPass2() {

    }

    //3.实例方法中可以出现this关键字，类方法不能出现this关键字
    //因为类方法没有实例化，this只能通过对象来调用
}
