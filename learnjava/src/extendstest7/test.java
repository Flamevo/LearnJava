package extendstest7;

public class test {
    public static void main(String[] args) {
        Fu f = new Fu();
        Zi z = new Zi();
        f.method();
        z.method();
    }
}
// final修饰变量、修饰类、修饰方法
// final修饰类：这个类现在就是最终类，不能被继承
// final修饰方法：这个方法是最终的方法，不能被子类重写
class Fu{
     public void method(){
        System.out.println("method方法执行了");
    }
}

class Zi extends Fu{
    @Override
    public void method(){
        System.out.println("子类重写了method方法");
    }
}
