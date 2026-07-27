public class OperatorDemo1 {
    public static void main(String[] args){

        //整数计算
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //小数计算
        //小数直接参与计算，计算可能是不准确的
        double c = 10.0;
        double d = 3.0;
        System.out.println(c + d);
        System.out.println(c - d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c % d);
    }
}