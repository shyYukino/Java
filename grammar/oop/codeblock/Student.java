package grammar.oop.codeblock;

public class Student {
    //类变量
    static int number = 80;
    static String schoolName;
    //静态代码块，类加载时自动执行且只执行一次，完成类的初始化
    static {
        System.out.println("静态代码块已执行");;
        schoolName = "丁真";
    }

    int age;
    //实例代码块，可以对实例变量进行初始化赋值，每次创建对象时都会先执行实例代码块，再会调用构造器
    //实例代码块作用：可以把构造器中重复的语句拿到实例代码块中执行，减少程序的重复编写
    {
        System.out.println("实例代码块已执行");
    }

    public Student() {
        System.out.println("无参数构造器已执行");
    }

    public Student (String name) {
        System.out.println("有参数构造器已执行");
    }
}
