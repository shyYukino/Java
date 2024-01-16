package grammar.base;

public class test1 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        chu(10, 0);
        System.out.println("程序结束");
    }

    public static void chu(int a, int b) {
        if (b == 0) {
            System.out.println("数据有误");
            return;
        }
        int c = a / b;
        System.out.println(c);
    }
}