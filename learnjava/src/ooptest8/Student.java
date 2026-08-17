package ooptest8;

public class Student {
    //对象共享的属性应该用static作为静态变量
    String name; //名字
    int age; //年龄
    static String teachername; //老师名

    public Student(){}
    public Student(String name, int age, String teachername){
        this.age = age;
        this.name = name;
        this.teachername = teachername;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setTeachername(String teachername){
        this.teachername = teachername;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getTeachername(){
        return teachername;
    }
}
