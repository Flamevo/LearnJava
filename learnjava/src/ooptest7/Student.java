package ooptest7;

public class Student {
    private String name;
    private int age;

    public Student(){}

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void learn(){
        System.out.println(this.name + " is learning");
    }
}
