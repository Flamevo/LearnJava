package ooptest4;

public class test {
    public static void main(String[] args){
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);
        s.setHeight(183);
        s.setWeight(60);

        //大二期间
        s.changeAge(1);
        s.changeWeight(10);

        //大三期间
        s.changeHeight(2);
        s.changeWeight(-3);
        s.changeAge(1);

        //毕业后
        System.out.print(s.getName() + "毕业后" + s.getAge() + "岁" + "，体重" + s.getWeight() + "kg, 身高" + s.getHeight() + "cm");
    }
}
