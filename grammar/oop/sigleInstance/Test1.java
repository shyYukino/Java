package grammar.oop.sigleInstance;

public class Test1 {
    public static void main(String[] args) {
        //单例设计模式
        /* 1.把构造器私有
         * 2.定义一个类变量记住类的一个对象
         * 3.定义一个类方法，用来返回对象
         */
        A a1 = A.getObject();
        A a2 = A.getObject();
        //只会创建一个对象，减少内存浪费
        System.out.println(a1);
        System.out.println(a2);
    }
}
