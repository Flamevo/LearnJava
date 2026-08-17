package ooptest6;

public class test {
    public static void main(String[] args){
        Student s = new Student();
        Student ss = new Student("xy", "male", 23, 1.72);
        s.getInfo();
        ss.getInfo();
    }
}
