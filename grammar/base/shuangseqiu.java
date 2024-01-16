package grammar.base;

import java.util.Random;
import java.util.Scanner;

public class shuangseqiu {
    public static void main(String[] args) {
        int[] userNumbers = userSelectNumbers();
        System.out.println("您投注的号码:");
        printArray(userNumbers);

        int[] luckNumbers = createLuckNumbers();
        System.out.println("中奖的号码:");
        printArray(luckNumbers);

        judge(userNumbers, luckNumbers);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }

    public static int[] userSelectNumbers() {
        int[] numbers = new int[7];

        Scanner sc = new Scanner(System.in);
        try {
            //先投注红球号码
            for (int i = 0; i < numbers.length - 1; ++i) {
                while (true) {
                    System.out.println("请您输入第" + (i + 1) + "个红球号码(1-33之间,不能重复):");
                    int number = sc.nextInt();

                    if (number < 1 || number > 33) {
                        //判断数字是否在1-33范围内
                        System.out.println("对不起,您输入的红球号码不在1-33之间,请确认!");
                    } else {
                        //判断数字是否已经存在
                        if (exist(numbers, number)) {
                            System.out.println("对不起，您当前输入的红球号码前面已经选择过，请重新确认！");
                        } else {
                            //若已经可以使用
                            numbers[i] = number;
                            break;
                        }
                    }
                }
            }
            
            while (true) {
                //再投注蓝球号码
                System.out.println("请您输入最后一个蓝球号码(1-16):");
                int number = sc.nextInt();
                if (number < 1 || number > 16) {
                    System.out.println("对不起，蓝球号码范围不对！");
                } else {
                    numbers[6] = number;
                    break;
                }
            }
        }

        finally {
            sc.close();
        }

        return numbers;
    }

    public static boolean exist(int[] numbers, int number) {
        //判断number是否在numbers中存在
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static int[] createLuckNumbers() {
        int[] numbers = new int[7];

        Random r = new Random();
        //遍历前六个位置，依次随机一个红球号码存入
        for (int i = 0; i < numbers.length - 1; ++i) {
            while (true) {
                //随机一个1-33之间的号码存入number
                int number = r.nextInt(33) + 1;

                //判断这个数字是否出现过
                if (!exist(numbers, number)) {
                    numbers[i] = number;
                    break;
                }
            }
        }

        //录入蓝球号码
        numbers[6] = r.nextInt(16) + 1;
        return numbers;
    }

    public static void judge(int[] userNumbers, int[] luckNumbers) {
        //定义两个变量记录红球命中了几个以及蓝球命中了几个
        int redcnt = 0;
        int bluecnt = 0;

        //遍历前6个红球
        for (int i = 0; i < userNumbers.length - 1; i++) {
            for (int j = 0; j < luckNumbers.length - 1; j++) {
                if (userNumbers[i] == luckNumbers[j]) {
                    redcnt++;
                    break;
                }
            }
        }

        //判断蓝球是否命中
        bluecnt = userNumbers[6] == luckNumbers[6] ? 1 : 0;

        System.out.println("您命中的红球数量是：" + redcnt);
        System.out.println("您命中的红球数量是：" + bluecnt);

        if (redcnt == 6 && bluecnt == 1) {
            System.out.println("恭喜您,中奖1000w元");
        } else if (redcnt == 6 && bluecnt == 0) {
            System.out.println("恭喜您,中奖500w元");
        } else if (redcnt == 5 && bluecnt == 1) {
            System.out.println("恭喜您,中奖3000元");
        } else if (redcnt == 5 && bluecnt == 0 || redcnt == 4 && bluecnt == 1) {
            System.out.println("恭喜您,中奖200元");
        } else if (redcnt == 4 && bluecnt == 0 || redcnt == 3 && bluecnt == 1) {
            System.out.println("恭喜您,中奖10元");
        } else if (redcnt < 3 && bluecnt == 1) {
            System.out.println("恭喜您,中奖5元");
        } else {
            System.out.println("感谢您对福利事业做出的巨大贡献！");
        }
    }
}
