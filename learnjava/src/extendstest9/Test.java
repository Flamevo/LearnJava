package extendstest9;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student("xy", 23);
        System.out.println(stu1.name + " " + stu1.age);
        System.out.println(stu2.name + " " + stu2.age);
    }
}


