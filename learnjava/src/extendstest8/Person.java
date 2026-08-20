package extendstest8;

public class Person {
    String name;
    int age;

    public Person(){
        System.out.println("父类空参构造执行");
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
