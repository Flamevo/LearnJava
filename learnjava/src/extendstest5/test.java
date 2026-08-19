package extendstest5;

public class test {
    public static void main() {
        Phone1 p1 = new Phone1();
        Phone2 p2 = new Phone2();
        Phone3 p3 = new Phone3();
        p1.call();
        System.out.println("----------------");
        p2.call();
        p2.text();
        System.out.println("----------------");
        p3.call();
        p3.text();
        p3.game();
    }
}

class Phone1{
    public void call(){
        System.out.println("具有打电话功能");
    }
}

class Phone2 extends Phone1{
    public void text(){
        System.out.println("具有发短信功能");
    }
}

class Phone3 extends Phone2{
    @Override // @注解
    public void call(){
        System.out.println("能够进行视频通话");
    }
    public void game(){
        System.out.println("具有玩游戏功能");
    }
}