package grammar.oop.codeblock;

public class Test {
    public static void main(String[] args) {
        //静态代码块只会在加载对象时执行一次，且为第一个执行
        System.out.println(Student.number);
        System.out.println(Student.number);
        System.out.println(Student.number);

        System.out.println(Student.schoolName);
    }
}
