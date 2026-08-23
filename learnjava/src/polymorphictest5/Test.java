package polymorphictest5;

public class Test {
    public static void main(String[] args){
        Person person = new Person();
        Pet c = new Cat(5, "橘黄色");
        Pet d = new Dog(6, "白色");
        person.keepPet(c, "猫粮");
        person.keepPet(d, "狗粮");
    }
}
