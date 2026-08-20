package extendshw1;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("0819", "xy", 10000, 1000);
        Cook cook = new Cook("0523", "wyc", 10000);
        System.out.println(manager.getID() + ',' + manager.getName() + ',' + manager.getSalary() + "," + manager.getBonus());
        System.out.println(cook.getID() + "," + cook.getName() + "," + cook.getSalary());
    }
}
