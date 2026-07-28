import java.util.Scanner;

public class ForDemo6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于3的数");
        int num = sc.nextInt();
        int result = 0;
        int num1 = 0, num2 = 1;
        for(int i = 3; i <= num; i++){
            result = num1 + num2;
            num1 = num2;
            num2 = result;
        }
        System.out.println(result);
    }
}
