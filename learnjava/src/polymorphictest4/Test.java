package polymorphictest4;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        Shape c = new Cycle(10);
        Shape r = new Rectangle(10, 10);
        stu.useShape(c);
        stu.useShape(r);
    }
}
