package aaa;

public class Person {
    public String name;

    public void test(){
        System.out.println("父类test方法");
    }

    public void show(){
        System.out.println(name);
        test();
    }
}
