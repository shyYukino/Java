package grammar.oop.interface2;

import java.util.ArrayList;

//接口类型，提供实现方案的模板
public interface StudentOperator {
    //定义打印全部信息抽象方法，需要接收学生类容器
    void printAllInfo(ArrayList<Student> students);
    
    //定义打印平均成绩抽象方法，需要接收学生类容器
    void printAverageScore(ArrayList<Student> students);
} 