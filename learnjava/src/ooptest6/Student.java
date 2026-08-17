package ooptest6;

public class Student {
    private String name;
    private String gender;
    private int age;
    private double height;
    
    public Student(){
        //无需内容
    }

    public Student(String name, String gender, int age, double height){
        //赋值
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
    }

    public void getInfo(){
        System.out.println(this.name + "," + this.gender + "," + this.age + "," + this.height);   
    }
}

