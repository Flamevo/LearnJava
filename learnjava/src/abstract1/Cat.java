package abstract1;

public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color);
    }

    public Cat() {
    }

    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("猫捉老鼠");
    }
}
