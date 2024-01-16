package grammar.BasicAPI.package1;

import java.util.Random;
import java.util.Scanner;

import grammar.BasicAPI.package2.Demo1;
import grammar.BasicAPI.package2.Demo2;


public class Test {
    public static void main(String[] args) {
        //1.同一个包下的程序可以直接访问
        Demo d = new Demo();
        d.print();

        //2.访问其他包下的程序，需要进行导包
        Demo1 d2 = new Demo1();
        d2.print();

        /*
        3.自己的程序中调用java提供的程序，也需要先导包才能使用；
        注意：java.lang包下的程序是不需要我们导包的，可以直接使用
        */
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            String s = "丁真";
            Random r = new Random();
            System.out.println(a + " " + s + " " + r);
        }

        finally {
            sc.close();
        }

        /*
        4.访问多个其他包下的程序，这些程序名又一样的情况下，默认只能导入一个程序
        另一个程序必须带包名和类名来访问
        */
        //已经导入了package2包
        Demo2 d3 = new Demo2();
        d3.print();
        grammar.BasicAPI.package1.Demo2 d4 = new grammar.BasicAPI.package1.Demo2();
        d4.print();
    }
}
