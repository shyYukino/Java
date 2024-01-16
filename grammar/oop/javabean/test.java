package grammar.oop.javabean;

public class test {
    //实体类仅仅用于保存数据
    //一般数据存储交给一个类（实体类）完成
    //操作方法扔到另外一个类中
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("丁真");
        s1.setScore(100);
        System.out.println(s1.getName());
        System.out.println(s1.getScore());

        StudentOperator operator = new StudentOperator(s1);
        operator.printPass();
    }
}
