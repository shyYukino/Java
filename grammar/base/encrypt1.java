package grammar.base;

import java.util.Scanner;

public class encrypt1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("请输入需要加密的密码:");
            int num = in.nextInt();
            System.out.printf("加密后的结果是" + encrypt(num));
        }
        finally{
            in.close();
        }
    }
    
    public static String encrypt(int number) {
        int[] numbers = split(number);
        //拆分数组，对每一位分别进行加密
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] + 5) % 10;
        }

        //反转数组
        reverse(numbers);

        //用data存加密后的数据
        String data = "";
        for (int i = 0; i < numbers.length; i++) {
            data += numbers[i];
        }
        return data;
    }

    public static int[] split(int number) {
        int[] numbers = new int[4];
        numbers[0] = number / 1000;
        numbers[1] = (number / 100) % 10;
        numbers[2] = (number/10) % 10;
        numbers[3] = number % 10;
        return numbers;
    }

    public static void reverse(int[] numbers) {
        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
            int tmp = numbers[j];
            numbers[j] = numbers[i];
            numbers[i] = tmp;
        }
    }
}