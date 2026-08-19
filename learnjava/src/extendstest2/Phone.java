package extendstest2;

public class Phone extends Device{
    public Phone(){}
    public Phone(String brand, double price){
        this.brand = brand;
        this.price = price;
    }

    public void call(){
        System.out.println("calling");
    }

    public void text(){
        System.out.println(" texting");
    }
}
