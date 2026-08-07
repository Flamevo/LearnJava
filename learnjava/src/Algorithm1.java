//移除元素
import java.util.Scanner;

public class Algorithm1 {
    public static int [] RemoveElement(int nums[], int value){
        int res[] = new int [nums.length];
        int index = 0;
        for (int i = 0; i < res.length; i++) {
            if(nums[i] != value){
                res[index] = nums[i];
                index++;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组的长度");
        int len = sc.nextInt();
        int arr[] = new int [len];
        System.out.println("请输入数组");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("请输入要去除的值");
        int val = sc.nextInt();
        int res [] = RemoveElement(arr, val);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
