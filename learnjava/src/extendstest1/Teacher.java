package extendstest1;

public class Teacher extends Person{
    String subject;

    public Teacher(){}
    public Teacher(String name, int age, String subject){
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public void teach(){
        System.out.println(this.name + " is teaching");
    }
}
