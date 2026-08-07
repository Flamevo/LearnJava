//移除元素快慢指针
import java.util.Scanner;

public class Algorithm2 {
    public static void RemoveElement(int nums[], int value){
        int slow = 0, fast = 0;
        while(fast < nums.length){
            if(nums[fast] != value){
                nums[slow] = nums[fast];
                slow++;
                fast++;
            }else{
                fast++;
            }
        }
        for (int i = 0; i < slow; i++) {
            System.out.print(nums[i] + " ");
        }
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
        RemoveElement(arr, val);
    }
}
