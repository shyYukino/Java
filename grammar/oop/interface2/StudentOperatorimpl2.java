package grammar.oop.interface2;

import java.util.ArrayList;

//方案二实现类，用于实现接口
public class StudentOperatorimpl2 implements StudentOperator {

    @Override
    public void printAllInfo(ArrayList<Student> students) {
        System.out.println("------全班全部学生信息如下------");
        //cnt1记录男生人数，cnt2记录女生人数
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("姓名" + s.getName() + "，性别：" + s.getSex() + "，成绩：" + s.getScore());
            if (s.getSex() == '男') cnt1++;
            else cnt2++;
        }
        System.out.println("男生人数：" + cnt1);
        System.out.println("女生人数：" + cnt2);
        System.out.println("总人数：" + students.size());
        System.out.println("-------------------------------");
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double allScore = 0.0;
        double max = students.get(0).getScore();
        double min = students.get(0).getScore();
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getScore() > max) max = s.getScore();
            if (s.getScore() < min) min = s.getScore();
            allScore += s.getScore();
        }
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("平均分：" + (allScore - max - min) / (students.size() - 2));
        
    }
    
}
