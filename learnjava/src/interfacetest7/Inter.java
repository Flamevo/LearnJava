package interfacetest7;

public interface Inter {
    private void test1(){ //不想被外部调用
        System.out.println("检查网络");
        System.out.println("检查用户名和密码的格式");
        System.out.println("检查用户名是否存在");
    }

    private static void test2(){ //不想被外部调用
        System.out.println("检查网络");
        System.out.println("检查用户名和密码的格式");
        System.out.println("检查用户名是否存在");
    }

    public default void login(){
        test1();
        System.out.println("执行登录的逻辑");
    }
    public static void register(){
        test2();
        System.out.println("执行注册的逻辑");
    }
}
