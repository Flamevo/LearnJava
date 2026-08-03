import java.util.Scanner;

public class MethodDemo1 {
    public static int getSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int sum = getSum(a, b);
        System.out.println(sum);
    }
}
