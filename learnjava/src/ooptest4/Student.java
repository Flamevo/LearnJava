package ooptest4;

public class Student {
    private String name;
    private int age;
    private int height;
    private double weight;
    
    public void setName(String value){
        name = value;
    }
    public void setAge(int value){
        if(value >= 0 && value <= 100){
            age = value;
        }else{
            System.out.println("年龄不合法");
            age = 0;
        }
            
    }
    public void setHeight(int value){
        if(value >= 0 && value <= 400){
            height = value;
        }else{
            System.out.println("身高不合法");
            height = 0;
        }
    }
    public void setWeight(double value){
        if(value >= 0 && value <= 500.0){
            weight = value;
        }else{
            System.out.println("体重不合法");
            weight = 0;
        }
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    public void changeWeight(double value){
        weight += value;
    }
    public void changeHeight(int value){
        if(value > 0){
            height += value;
        }else{
            System.out.println("修改不合法");
        }
    }
    public void changeAge(int value){
        if(value > 0){
            age += value;
        }else{
            System.out.println("修改不合法");
        }
    }
}
