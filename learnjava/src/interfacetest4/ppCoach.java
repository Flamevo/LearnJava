package interfacetest4;

public class ppCoach extends Coach implements Speak {
    public ppCoach() {
    }

    public ppCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach(){
        System.out.println("教打乒乓球");
    }

    @Override
    public void speak(){
        System.out.println("说英语");
    }
}
