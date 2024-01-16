package grammar.oop.inner_class1;

//匿名内部类
//对于某个抽象类，使用匿名内部类可以不单独建一个子类实现抽象类
public class Test {
    public static void main(String[] args) {
        //Animal a = new Cat();
        //a.cry(); 

        //1.首先会将匿名内部类编译成一个子类，然后会立即创建一个子类对象出来
        Animal a = new Animal() {

            @Override
            public void cry() {
                System.out.println("喵");
                
            }
        };
        a.cry();
    }
}

class Cat extends Animal {

    @Override
    public void cry() {
        System.out.println("喵");
        
    }
    
}

//匿名内部类不仅仅对于抽象类适用，对于接口也适用
abstract class Animal {
    public abstract void cry();
    
}

