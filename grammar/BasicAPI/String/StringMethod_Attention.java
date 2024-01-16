package grammar.BasicAPI.String;

public class StringMethod_Attention {
    public static void main(String[] args) {
        //1.String的对象是不可变的
        //表面上对String对象的更改操作，实际上是在堆内存中创造了新的对象，将新的对象地址传给原来的对象
        String name = "丁真";
        name += "雪豹";
        System.out.println(name);

        //2.只要是以双引号给出的字符串对象，就会存储在常量池中，并且内容相同时只会存储一份
        //注意区别常量池与堆内存是不同的，常量池位于堆中
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);   //true,两个对象指向的同一个位置

        //3.new String创建字符串对象，每次new创建的都是一个新对象，放在堆内存中
        char[] chars = {'a', 'b', 'c'};
        String a1 = new String(chars);
        String a2 = new String(chars);
        System.out.println(a1 == a2);   //false 
    }
}
