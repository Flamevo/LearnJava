package interfacetest4;

public class ppAthlete extends Athlete implements Speak {
    public ppAthlete() {
    }

    public ppAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn(){
        System.out.println("学打乒乓球");
    }

    @Override
    public void speak(){
        System.out.println("说英语");
    }
}
