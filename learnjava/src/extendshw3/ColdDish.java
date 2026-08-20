package extendshw3;

public class ColdDish extends Dish{
    private String exp; //保质期

    public ColdDish() {}

    public ColdDish(String name, double price, String taste, String exp) {
        super(name, price, taste);
        this.exp = exp;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    @Override
    public void introduction(){
        System.out.println(this.getName() + "," + this.getPrice() + "," + this.getTaste() + "," + this.getExp());
    }
}
