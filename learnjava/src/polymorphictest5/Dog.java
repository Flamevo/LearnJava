package polymorphictest5;

public class Dog extends Pet{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something){
        System.out.println(this.getAge()+ "岁" + this.getColor() + "的狗正在吃" + something);
    }

    public void lookHome(){
        System.out.println(this.getAge()+ "岁" + this.getColor() + "的狗正在看家");
    }
}
