package grammar.oop.encapsulation;

public class Student {
    //隐藏成员防止外界随意更改score值
    private double score;

    //为外界提供一个更改score的接口
    public void setScore(double score) {
        if (score >= 0 && score <= 100)
            this.score = score;
        else
            System.out.println("数据非法");
    }

    //输出score
    public double getScore() {
        return score;
    }

    public void printPass() {
        System.out.println(score >= 60 ? "成绩及格" : "成绩不及格");
    }
}
