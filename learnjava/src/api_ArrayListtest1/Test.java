package api_ArrayListtest1;

import java.util.ArrayList;

public class Test {
    static void main(String[] args) {
        //创建一个长度为0的ArrayList集合
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(10);
        System.out.println(list);

        //取出来
        //多态弊端：无法使用子类的特有行为
        Object o = list.get(0);
        //泛型：限定集合当作存储说明类型 <数据类型>
        ArrayList<String> l = new ArrayList<String>(); //后面可省略为 new ArrayList<>()
        l.add("aaa");
        l.add("bbb");
        l.add("ccc");
        boolean res = l.add("10"); //.add一定会添加成功，永远不会失败
        //设计原因是针对别的集合可能出现元素唯一的情况

        //在集合当中无法直接添加基本数据类型
        // 只能添加引用数据类型（对象）
        // 如果在集合里一定要添加基本数据类型，需要转成其对应的包装类
        System.out.println(res);
        System.out.println(l);

        l.add(0, "dadad");
        System.out.println(l);

        //根据元素进行删除
        l.remove("aaa");
        System.out.println(l);
        l.remove(0); //索引不存在则会报错
        System.out.println(l);

        //修改对应索引的内容
        String replaced = l.set(0, "zzz"); //返回被替换的元素
        System.out.println(replaced);
        System.out.println(l);

        //遍历
        for(int i = 0; i < l.size(); i++){
            String s = l.get(i);
            System.out.println(s);
        }
    }
}
