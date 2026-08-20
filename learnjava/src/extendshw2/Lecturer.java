package extendshw2;

public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(String name, String ID) {
        super(name, ID);
    }

    @Override
    public void work(){
        System.out.println("讲师正在教授课程");
    }
}
