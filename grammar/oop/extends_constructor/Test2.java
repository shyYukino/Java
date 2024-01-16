package grammar.oop.extends_constructor;

//父类people
class people {
    private String name;
    private int age;

    //无参构造器
    public people() {
    }

    //有参构造器
    public people(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Teacher extends people {
    private String skill;

    //调用子类有参数构造器时，可以在子类有参数构造器内用super关键字调用父类有参数构造器
    //因为在父类中，某些属性是被父类private所封装的，子类无法访问，需要调用父类构造器
    public Teacher(String name, int age, String skill) {
        //调用父类有参数构造器
        super(name, age);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
    
}
public class Test2 {
    public static void main(String[] args) {
        Teacher t = new Teacher("丁真", 20, "抽电子烟");
        System.out.println(t.getName());
        System.out.println(t.getAge());
        System.out.println(t.getSkill());
    }
}
