package extendstest2;

import java.awt.color.ICC_ColorSpace;

public class Laptop extends Device{
    public Laptop(){}
    public Laptop(String brand, double price){
        this.brand = brand;
        this.price = price;
    }

    public void coding(){
        System.out.println("coding");
    }
}
