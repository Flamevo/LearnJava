package extendstest8;

public class Student extends Person{
    String grade;
    public Student(){
        System.out.println("子类空参构造执行");
    }
    public Student(String name, int age, String grade){
        super(name, age);
        this.grade = grade;
    }
}
