package extendshw5;

public class Express {
    private String id;
    private int weight;
    private String receiver;

    public Express() {
    }

    public Express(String id, String receiver, int weight) {
        this.id = id;
        this.receiver = receiver;
        this.weight = weight;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double payment(){
        return weight * 10;
    }
}
