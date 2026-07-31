import java.util.Random;
import java.util.Scanner;

public class LoopDemo1 {
    public static void main(String[] args){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int random = r.nextInt(1, 101);
        while(true){
            System.out.println("请输入一个1 ~ 100的整数");
            int guess = sc.nextInt();
            if(guess == random){
                System.out.println("恭喜你 猜对了");
                break;
            }else if(guess > random){
                System.out.println("猜的数太大了");
                continue;
            }else{
                System.out.println("猜的数太小了");
                continue;
            }
        }
    }
}
