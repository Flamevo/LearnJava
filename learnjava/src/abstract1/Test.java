package abstract1;

public class Test {
    public static void main(String[] args){
        Cat c = new Cat("猫咪", "白色");
        System.out.println(c.getColor() + " " + c.getName());
        c.eat();
        c.drink();
        c.catchMouse();
    }
}
