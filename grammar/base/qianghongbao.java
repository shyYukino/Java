package grammar.base;

import java.util.Random;
import java.util.Scanner;

public class qianghongbao {
    public static void main(String[] args) {
        int[] money = {111, 222, 333, 444, 555};
        start(money);
    }

    public static void start(int[] moneys) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("请您输入任意内容抽奖：");
                sc.next(); //等待用户输入内容，按了回车往下走

                while (true) {
                    //产生随机数
                    int index = r.nextInt(moneys.length);
                    //抽中的金额
                    int money = moneys[index];

                    if (money != 0) {
                        System.out.println("恭喜您，抽中了红包" + money);
                        moneys[index] = 0;
                        break;
                    }
                }
            }   
            System.out.println("活动结束");
        }

        finally {
            sc.close();
        }
    }
}
