package extendshw5;

public class SameCity extends Express{
    public SameCity() {
    }

    public SameCity(String id, String receiver, int weight) {
        super(id, receiver, weight);
    }

    @Override
    public double payment(){
        return super.payment() + 10;
    }
}
