import java.util.Scanner;

public class BreakDemo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        键盘录入一个大于等于2的整数，判断是否为质数
        */
        int count = 0;
        System.out.println("请输入一个大于等于2的整数");
        int number = sc.nextInt();
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.println(number + "是质数");
        }else{
            System.out.println(number + "不4是质数");
        }
    }
}
