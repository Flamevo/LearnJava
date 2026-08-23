package polymorphictest4;

public class Cycle extends Shape{
    private double PI = 3.1415926;
    private double radius;

    public Cycle() {
    }

    public Cycle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public double getC(){
        return 2 * PI * radius;
    }

    public double getS(){
        return PI * radius * radius;
    }
}
