package extendstest10;

public class BachelorStudent extends Student{
    public BachelorStudent(){}
    public BachelorStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study(){
        System.out.println("本科生正在攻读学士学位");
    }
}

