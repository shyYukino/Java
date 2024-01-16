package grammar.oop.constructor;

public class Test {
    public static void main(String[] args) {
        //调用无参数构造器
        Student s1 = new Student();
        //调用有参数构造器
        Student s2 = new Student("丁真", 99); 
        //对当前成员对象初始化赋值
        Student s3 = new Student("雪豹", 100);

        s1.score = 100;
        System.out.println(s1.score);
        System.out.println(s2.name);
        System.out.println(s2.score);
        System.out.println(s3.name);
        System.out.println(s3.score);
    }
}
