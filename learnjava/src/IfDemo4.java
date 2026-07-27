import java.util.Scanner;
public class IfDemo4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入价格");
        double price = sc.nextDouble();

        double price1 = 50 * 0.9; //饱了吗

        //美单
        double price2 = 0; //变量只在所属的大括号内有效
        if(price >= 30){
            price2 = price - 10;
        }else{
            price2 = price;
        }

        if(price1 > price2){
            System.out.println("美单更优惠" + price2);
        }else{
            System.out.println("饱了吗更优惠" + price1);
        }
        sc.close();
    }
}
