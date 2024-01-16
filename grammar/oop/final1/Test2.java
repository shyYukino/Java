package grammar.oop.final1;

public class Test2 {
    //常量：static final修饰的成员变量，值是固定的，建议名称全部大写，下划线连接
    //用来记录系统的配置信息
    //可读性好，可维护性好，且使用常量与字面量的性能相同
    public static final String SCHOOL_NAME = "理塘";
    public static void main(String[] args) {
        System.out.println(SCHOOL_NAME);
    }
}
