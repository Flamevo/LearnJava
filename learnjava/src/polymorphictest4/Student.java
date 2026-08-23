package polymorphictest4;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void useShape(Shape shape){
        if(shape instanceof Cycle){
            Cycle c = (Cycle) shape;
            System.out.println("圆形的周长为" + c.getC() + "面积为" + c.getS());
        }else if(shape instanceof Rectangle){
            Rectangle r = (Rectangle) shape;
            System.out.println("矩形的周长为" + r.getC() + "面积为" + r.getS());
        }else{
            System.out.println("不存在这个类");
        }
    }
}
