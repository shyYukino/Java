package grammar.base;

public class test {
    public static void main(String[] args) {
        print();
    }

    public static void print() {
        for (int i = 1; i <= 9; ++i)
            for (int j = 1; j <= i; ++j) {
                if (i != j)
                    System.out.print(j + "*" + i + "=" + i * j + "\t");
                else
                    System.out.println(j + "*" + i + "=" + i * j);
            }
    }
}
