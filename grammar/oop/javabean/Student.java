package grammar.oop.javabean;

//实体类，专门用于存放数据,只有对于对象的get、set方法
public class Student {
    //1.必须私有成员变量，并且必须有get、set方法
    //get、set方式就是提供给外界访问javabean中变量的方式
    private String name;
    private double score;

    //2.必须为类提供一个无参数构造器（java会自动构造）
    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
    //有参构造器
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    //无参构造器
    public Student() {

    }

    
    
}
