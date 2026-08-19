package extendstest2;

public class Android extends Phone{
    public Android(){}
    public Android(String brand, double price){
        this.brand = brand;
        this.price = price;
    }

    public void nfc(){
        System.out.println("nfc");
    }
}
