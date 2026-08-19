package extendstest3;

public class test {
    public static void main() {
        Zi z = new Zi();
        z.ziShow();
    }
}

class Fu{
    String name = "Fu";
}

class Zi extends Fu{
    String name = "Zi";

    public void ziShow(){
        String name = "ziShow";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name); //使用父类的内容 最多只能访问到父类
    }
}