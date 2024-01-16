package grammar.BasicAPI.ArrayList;

import java.util.ArrayList;

public class ArrayList_BasicMethod {
    public static void main(String[] args) {
        //1.创建ArrayList集合对象,与c++中的vector类似
        ArrayList<String> list = new ArrayList<>();
        list.add("丁真");
        list.add("java");
        System.out.println(list);

        //2.往集合中的某个索引位置处添加一个数据
        list.add(1, "MySQL");
        System.out.println(list);

        //3.根据索引获取集合中某个索引位置处的值
        String rs = list.get(1);
        System.out.println(rs);

        //4.获取集合的大小（集合中u年初的元素个数）
        System.out.println(list.size());

        //5.根据索引删除集合中的某个元素值，会返回被删除的元素值
        System.out.println(list.remove(1));
        System.out.println(list);

        //6.直接删除某个元素值，删除成功会返回true，反之返回false
        System.out.println(list.remove("java"));
        System.out.println(list);
        //注意，若集合中有两个相同的数据，调用remove时会默认删除第一个数据

        //7.修改某个索引位置处的数据，修改后会返回原来的值
        System.out.println(list.set(0, "雪豹"));
        System.out.println(list);
    }
}
