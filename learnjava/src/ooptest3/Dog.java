package ooptest3;

public class Dog {
    private String name;
    private int age;
    public void setAge(int value){
        if(value >= 0 && value <= 15){
            age = value;
        }else{
            age = 0;
            System.out.println("小狗年龄非法");
        }
    }
    public int getAge(){
        return age;
    }

    public void setName(String value){
        name = value;
    }
    public String getName(){
        return name;
    }
}
