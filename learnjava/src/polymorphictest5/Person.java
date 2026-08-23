package polymorphictest5;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Pet pet, String something){
        if(pet instanceof Cat){
            Cat c = (Cat) pet;
            c.eat(something);
            c.catchMouse();
        }else if(pet instanceof Dog){
            Dog d = (Dog) pet;
            d.eat(something);
            d.lookHome();
        }else{
            System.out.println("该类不存在");
        }
    }
}
