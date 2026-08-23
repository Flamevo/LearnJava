package polymorphictest3;

public class Car extends Vehicle {
    public Car() {
    }

    public Car(double v, String brand) {
        super(v, brand);
    }

    public void honk(){
        System.out.println("汽车正在鸣笛");
    }

    @Override
    public void move(){
        System.out.println(this.getBrand() + "汽车正以" + this.getV() + "的速度移动");
    }
}
