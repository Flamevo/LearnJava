package extendstest1;

public class Student extends Person{
    String grade;

    public Student(){}
    public Student(String name, int age, String grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void learn(){
        System.out.println(this.name + " is learning");
    }
}
