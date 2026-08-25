package innerclasstest2;

public class Test {
    static void main(String[] args) {
        Swim s = new Swim(){
            @Override
            public void swim(){
                System.out.println("学生正在游泳");
            }
        };
        s.swim();
    }
}
