package grammar.oop.extends_constructor;

class F {
    //父类无参构造器
    public F() {
        System.out.println("父类F的无参构造器被调用");
    }
}

//当我们调用子类的构造器时，会首先调用父类的构造器，再执行自己
class Z extends F {
    //子类无参构造器
    public Z() {
        //默认情况下，子类的全部构造器第一行代码都是super()（写不写都有），它会调用父类的无参数构造器
        //super();  调用父类的无参数构造器
        //注意：若父类没有无参数构造器，我们必须在子类的构造器的第一行写上super(...)，指定去调用父类的有参数构造器
        System.out.println("子类Z的无参构造器被调用");
    }
    
     int num = 233;

}
public class Test {
    public static void main(String[] args) {
        Z z = new Z();
        System.out.println(z.num);
    }
}
