import java.util.Scanner;

public class IfDemo5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result;
        if(n % 2 == 0){
            result = n / 2;
        }else{
            result = 3 * n + 1;
        }
        System.out.println(result);
        sc.close();
    }
}
