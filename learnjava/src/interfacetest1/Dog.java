package interfacetest1;

public class Dog extends Animal implements Swim{
    public Dog() {
    }

    public Dog(String color, String name) {
        super(color, name);
    }

    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }

    @Override
    public void swim(){
        System.out.println("狗会狗刨");
    }
}
