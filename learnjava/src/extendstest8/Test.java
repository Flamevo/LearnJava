package extendstest8;

public class Test {
    /*
    * 继承结构当中构造方法的小细节:
    * 1.子类构造方法第一行，有一个默认的super()，如果我们没有书写，JVM也会自动加上
    * 2.如果想要访问父类的带参构造，super(参数)必须手动加上，不能省略
    * 3.在创建对象的时候，先执行父类的构造方法，再执行子类的构造方法
    * */
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student("xy", 23, "grade1");
        System.out.println(stu1.name + " " + stu1.age);
        System.out.println(stu2.name + " " + stu2.age + " " + stu2.grade);
    }
}
