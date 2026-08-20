package extendshw2;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(String name, String ID) {
        super(name, ID);
    }

    @Override
    public void work(){
        System.out.println("维护专员正在维护");
    }

}
