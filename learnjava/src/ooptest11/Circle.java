package ooptest11;

public class Circle {
    private final double PI = 3.1415926;
    private double r ;

    public double getC(){
        double c = 2 * PI * r;
        return c;
    }

    public double getS(){
        double s = PI * r * r;
        return s;
    }

    public void setR(double r){
        this.r = r;
    }

    public double getR(){
        return r;
    }

    public double getPI(){
        return PI;
    }
}
