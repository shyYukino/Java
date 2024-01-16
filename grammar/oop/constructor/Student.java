package grammar.oop.constructor;

public class Student {
    String name;
    double score;

    //无参数构造器constructor
    public Student() {
        System.out.println("无参数构造器被执行");
    }

    //有参数构造器
    public Student(String name, double score) {
        System.out.println("有参数构造器被执行");
        this.name = name;
        this.score = score;
    }
}
