package extendshw2;

public class Employee {
    private String ID;
    private String name;

    public Employee() {}
    public Employee(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work(){
        System.out.println("员工正在工作");
    }
}
