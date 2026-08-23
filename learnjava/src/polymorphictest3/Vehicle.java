package polymorphictest3;

public class Vehicle {
    private String brand;
    private double v;

    public Vehicle() {
    }

    public Vehicle(double v, String brand) {
        this.v = v;
        this.brand = brand;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void move(){
        System.out.println(brand + "交通工具正以" + v + "的速度移动");
    }
}
