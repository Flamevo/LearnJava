package extendshw2;

public class Tutor extends Teacher{
    public Tutor() {
    }
    public Tutor(String name, String ID) {
        super(name, ID);
    }

    @Override
    public void work(){
        System.out.println("助教正在辅助讲师上课");
    }
}
