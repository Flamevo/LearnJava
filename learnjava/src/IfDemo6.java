import java.util.Scanner;
public class IfDemo6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double price1 = price;
        double price2 = price;
        double discount = 0.9;

        if(price1 >= 200){
            price1 -= 90;
        }else if(price1 >= 100){
            price1 -= 50;
        }else if(price1 >= 50){
            price1 -= 30;
        }else if(price1 >= 10){
            price1 -= 8;
        }

        price2 *= discount;
        if(price1 > price2){
            System.out.println("会员卡更便宜 " + price2);
        }else{
            System.out.println("优惠券更优惠 " + price1);
        }
        sc.close();
    }
}
