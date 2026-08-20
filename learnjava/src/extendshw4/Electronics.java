package extendshw4;

public class Electronics extends Goods{
    private String brand;
    private String type;

    public Electronics() {
    }

    public Electronics(String name, double price, String brand, String type){
        super(name, price);
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void introduction(){
        System.out.println(this.getName() + "," + this.getPrice() + "," + this.getBrand() + "," + this.getType());
    }
}
