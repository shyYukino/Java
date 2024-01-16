package grammar.oop.enum1;

public enum A {
    //注意：枚举类的第一行必须罗列的是枚举对象的名字
    //枚举都是最终类，不可以被继承
    //枚举类中，从第二行开始可以定义类的其他各种成员
    //枚举类的构造器都是私有的，不能对外创建对象
    X, Y, Z;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
