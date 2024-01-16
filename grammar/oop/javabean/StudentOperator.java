package grammar.oop.javabean;

//对象操作类，专门用于存操作对象的方法
public class StudentOperator {
    //接收学生对象
    private Student student;
    public StudentOperator(Student student) {
        this.student = student;
    }

    public void printPass() {
        if (student.getScore() >= 60)
            System.out.println("成绩及格");
        else
            System.out.println("成绩不及格");
    }
}
