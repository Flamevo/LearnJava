package extendshw5;

public class DiffCity extends Express{
    public DiffCity() {
    }

    public DiffCity(String id, String receiver, int weight) {
        super(id, receiver, weight);
    }

    @Override
    public double payment(){
        return super.payment() + 15;
    }
}
