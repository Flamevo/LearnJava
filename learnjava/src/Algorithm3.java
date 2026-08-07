import java.util.Random;
import java.util.Scanner;

public class Algorithm3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("请输入红包总金额");
        int m = sc.nextInt();
        System.out.println("请输入人数");
        int n = sc.nextInt();
        int arr [] = new int [n];
        int rest = m;
        for(int i = 0; i < n - 1; i++){
            int num = random.nextInt(1, rest - n + i + 1);
            arr[i] = num;
            rest -= num;
        }
        arr[n - 1] = rest;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
