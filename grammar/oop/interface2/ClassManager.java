package grammar.oop.interface2;

import java.util.ArrayList;

//班级管理类
public class ClassManager {
    //定义学生类容器
    private ArrayList<Student> students = new ArrayList<>();

    //方案一
    //若要实现方案二，把StudentOperatorimpl1改为StudentOperatorimpl2即可
    private StudentOperator studentOperator = new StudentOperatorimpl1();

    //定义构造器
    public ClassManager() {
        students.add(new Student("丁真", '男', 99));
        students.add(new Student("陈泽", '男', 100));
        students.add(new Student("神鹰哥", '男', 98));
        students.add(new Student("孙笑川", '男', 100));
    }

    //打印全班全部学生信息
    public void printInfo() {
        studentOperator.printAllInfo(students);
    }

    //打印全班平均分
    public void printScore() {
        studentOperator.printAverageScore(students);
    }
}
