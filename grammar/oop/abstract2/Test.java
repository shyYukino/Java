package grammar.oop.abstract2;

public class Test {
    public static void main(String[] args) {
        Animal a = new cat();
        a.setName("丁真");
        a.cry();
        String name = a.getName();
        System.out.println(name);
        
        Animal b = new dog();
        b.setName("雪豹");
        b.cry();
        String name2 = b.getName();
        System.out.println(name2);
    }
}

//抽象类的应用场景和好处：
//父类知道每个子类都要做某个行为，但每个子类要做的情况不一样，父类就定义成抽象方法
//交给子类去重写实现，这样子定义一个抽象类是为了更好地执行多态
