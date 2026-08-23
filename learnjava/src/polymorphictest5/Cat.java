package polymorphictest5;

import com.sun.security.jgss.GSSUtil;

public class Cat extends Pet{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something){
        System.out.println(this.getAge()+ "岁" + this.getColor() + "的猫正在吃" + something);
    }

    public void catchMouse(){
        System.out.println(this.getAge()+ "岁" + this.getColor() + "的猫正在捉老鼠");
    }
}
