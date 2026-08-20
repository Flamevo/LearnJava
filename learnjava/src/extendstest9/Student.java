package extendstest9;

public class Student {
    String name;
    int age;
    /*细节：
    1. 如果子类中有多个构造方法的时候，不能用this()互相调用一定要预留一个调用父类的构造方法
    2. 如果构造方法中写上了this(),就不能和再写super(),JVM也不会自动加
    3. 老版本中要求this()只能写在构造方法第一行
    * */
    public Student(){
        //this()调用本类其他构造方法
        this("同学", 18); //用于自定义默认初始化对象
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
