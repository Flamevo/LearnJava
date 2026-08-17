package enumtest;

//public class Status {
//    private String name;
//
//    public Status(){}
//    public Status(String name){
//        this.name = name;
//    }
//}


public enum Status{
    //罗列这个类所有对象
    //Status PAYMENT_PENDING = new Status(“待支付”)
    PAYMENT_PENDING("待支付"),
    PROCESSING("处理中"),
    SHIPPED("已发货"),
    OUT_FOR_DELIVERY("配送中"),
    DELIVERED("已送达"),
    CANCELLED("已取消"),
    other(); //无参构造方法


    private String name;

    private Status(){}
    private Status(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
