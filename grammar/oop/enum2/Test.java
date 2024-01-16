package grammar.oop.enum2;

//枚举类可以用于做信息标志和分类，比如用户选择某选项之后对应给他推荐某东西
//这样子写代码能让代码可读性较好
public class Test {
    public static void main(String[] args) {
        check(Constant.BOY);
        check(Constant.GIRL);
    }

    public static void check(Constant sex) {
        switch (sex) {
            case BOY:
                System.out.println("展示一些涩图");
                break;
            case GIRL:
                System.out.println("展示一些购物信息");
                break;
        }
    }
}
