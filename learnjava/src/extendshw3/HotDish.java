package extendshw3;

public class HotDish extends Dish{
    private String time;

    public HotDish() {
    }

    public HotDish(String name, double price, String taste, String time) {
        super(name, price, taste);
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void introduction(){
        System.out.println(this.getName() + "," + this.getPrice() + "," + this.getTaste() + "," + this.getTime());
    }
}
