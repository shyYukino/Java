package grammar.base;

public class isprime {
    public static void main(String[] args) {
        System.out.println("当前素数的个数是：" + search(101, 200));
    }

    public static int search(int start, int end) {
        int ans = 0;
        OUT:    //用于标记外部循环
        for (int i = start; i <= end; ++i) {    
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    continue OUT;   //结束此次的外部循环
                }
            }
            System.out.println(i);
            ans++;
        }
        return ans;
    }
}
