package extendshw2;

public class Test {
    public static void main(String[] args){
        Lecturer l = new Lecturer();
        Tutor t = new Tutor();
        Maintainer m = new Maintainer();
        Buyer b = new Buyer();
        l.work();
        t.work();
        m.work();
        b.work();
    }
}
