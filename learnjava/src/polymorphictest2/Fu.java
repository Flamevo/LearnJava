package polymorphictest2;

public class Fu extends Ye{
    String name = "Fu";

    public void fuShow(){
        System.out.println("父类的fushow方法被调用了");
    }

    public void show(){
        System.out.println("父类的show方法被调用了");
    }
}
