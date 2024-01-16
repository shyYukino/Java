package grammar.oop.final1;

public class Test {
    public static void main(String[] args) {
        //3.final可以修饰变量：有且仅能赋值一次
        //变量：
        //1.局部变量、
        //2.成员变量
        //   (1)静态成员变量
        //   (2)实例成员变量
        final int a;
        a = 12;
        System.out.println(a);
        //a = 13; 第二次赋值会出错

        final double r = 3.14;
        System.out.println(r);
        //r = 0.1; 第二次赋值会出错

        //常量：static final修饰的成员变量，值是固定的，建议名称全部大写，下划线连接
        //用来记录系统的配置信息
    }
}

//1.final修饰类，类就不能被继承了,常见于工具类加final
final class A {}

//2.final修饰方法，方法就不能被重写了
class C {
    public final void test() {

    }
}

class D extends C {
    //public void test() {}
    //Cannot override the final method from C
}

//注意：final修饰基本类型的变量，变量存储的数据不能被改变
//      final修饰引用类型的变量，变量存储的地址不能被改变，但地址所指对象的内容可以被改变