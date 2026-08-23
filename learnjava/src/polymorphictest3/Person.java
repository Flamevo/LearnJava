package polymorphictest3;

public class Person {
    private String name;
    private String gender;
    private int age;

    public Person() {
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void drive(Vehicle v){
        v.move();

        if(v instanceof Bicycle){
            Bicycle b = (Bicycle) v;
            b.ringBell();
        }else if(v instanceof Car){
            Car c = (Car)v;
            c.honk();
        }else{
            System.out.println("没有这个类型");
        }
    }
}
