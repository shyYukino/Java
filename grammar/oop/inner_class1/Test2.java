package grammar.oop.inner_class1;

//匿名内部类可以更方便的创建一个子类对象，通常作为一个参数传输给方法
public class Test2 {
    public static void main(String[] args) {
//      Swimming s1 = new Swimming() {
//          @Override
//          public void swim() {
//              System.out.println("游得很快");            
//          }
//      };
//      go(s1);

        //上述代码可简化，直接作为参数传到go方法中
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("游得很快");
                
                }
        });

        }

    //定义go方法
    public static void go(Swimming s) {
        System.out.println("开始========");
        s.swim();
    }
}

//定义Swimming接口，相当于抽象类
interface Swimming {
    void swim();
}
