package grammar.oop.polymorphism;

public class Test {
    public static void main(String[] args) {
        //1.对象多态
        //通过父类可以创建不同类型的子类对象
        People p1 = new Teacher();
        People p2 = new Student();

        //2.行为多态
        //都是People的行为，但执行结果不一样

        //编译看左边，运行看右边，意思为父类中必须有同名的方法才能通过编译
        //但执行时会看子类重写的方法，即必须存在方法重写
        p1.run();
        p2.run();

        //注意：多态是对象、行为的多态，java中的属性（成员变量不谈多态）
        //意思是父类中定义的对象，在子类中存在同名的对象，在主程序中访问时只会访问到父类对象的变量
    }
}
