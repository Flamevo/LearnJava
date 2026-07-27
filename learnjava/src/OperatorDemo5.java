import java.util.Scanner;

public class OperatorDemo5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();
        int r = num % 3;
        if(r != 0){
            System.out.println("不能被3整除");
        }else{
            System.out.println("可以被三整除");
        }
        sc.close();
    }
}
