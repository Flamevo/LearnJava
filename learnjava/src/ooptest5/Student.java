package ooptest5;

public class Student {
    private int age;

    public void setAge(int age){
        // age = age;
        this.age = age; //不使用this.age 会遵循最近原则修改局部变量age
        System.out.println(age);
        System.out.println(this.age);
    }
}
