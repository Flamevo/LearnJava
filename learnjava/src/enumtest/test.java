package enumtest;

public class test {
    public static void main(String[] args){
        Status s1 = Status.DELIVERED;
        String name = s1.getName();
        System.out.println(name);

        Status s2 = Status.other;
        s2.setName("其他状态");
        System.out.println(s2.getName());

//        Status arr[] = Status.values();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i].getName());
//

        switch(s1){
            case PAYMENT_PENDING -> System.out.println("待支付状态");
            case PROCESSING -> System.out.println("处理中状态");
            case SHIPPED -> System.out.println("已发货状态");
            case OUT_FOR_DELIVERY -> System.out.println("配送中状态");
            case DELIVERED -> System.out.println("已送达状态");
            case CANCELLED -> System.out.println("已取消状态");
        }
    }
}
