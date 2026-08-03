import java.util.Scanner;

public class MethodDemo3 {
    public static void printarr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printarr(arr);
    }
}
