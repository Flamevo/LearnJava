package extendshw3;

public class Employee {
    private String ID;
    private String name;
    private double salary;

    public Employee() {}
    public Employee(String ID, String name, double salary){
        this.ID = ID;
        this.name = name;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("员工正在工作");
    }

    public void eat(){
        System.out.println("员工正在吃米饭");
    }
}
