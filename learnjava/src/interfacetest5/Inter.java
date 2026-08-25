package interfacetest5;

public interface Inter {
    default void method1(){
        System.out.println("接口的默认方法");
    }
    void method2();
}
