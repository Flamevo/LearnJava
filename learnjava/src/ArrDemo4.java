import java.util.Scanner;

public class ArrDemo4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr [] = new int [5];
        for (int i = 0; i < arr.length; i++) { //动态初始化
            arr[i] = sc.nextInt();
        }
        // System.out.println(arr[5]); 
        // Exception: Index 5 out of bounds for length 5
    }
}
