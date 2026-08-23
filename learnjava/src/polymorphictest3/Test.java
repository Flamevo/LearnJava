package polymorphictest3;

public class Test {
    public static void main(String[] args) {
        Person per = new Person();
        Vehicle t1 = new Bicycle(15, "捷安特");
        Vehicle t2 = new Car(60, "奔驰");
        per.drive(t1);
        per.drive(t2);
    }
}
