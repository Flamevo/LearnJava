package polymorphictest3;

public class Bicycle extends Vehicle {
    public Bicycle() {
    }

    public Bicycle(double v, String brand) {
        super(v, brand);
    }

    public void ringBell(){
        System.out.println("自行车响铃");
    }

    @Override
    public void move(){
        System.out.println(this.getBrand() + "自行车正以" + this.getV() + "的速度移动");
    }
}
