package ooptest8;

public class test {
    public static void main(String[] args){
        Student stu1 = new Student("xy", 23, "zy");
        Student stu2 = new Student("sc", 23, "zy");

        System.out.println(stu2.getTeachername());
        stu1.setTeachername("wzx");
        System.out.println(stu2.getTeachername());
    }
}
