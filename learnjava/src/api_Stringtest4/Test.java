package api_Stringtest4;

import java.util.Scanner;

public class Test {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度");
        int len = sc.nextInt();
        int nums [] = new int [len];
        System.out.println("请输入数组");
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(toString(nums));
    }

    public static String toString(int nums[]){
        String str = "[";
        for (int i = 0; i < nums.length; i++) {
            if(i != (nums.length - 1)){
                str += nums[i] + ", ";
            }else{
                str += nums[i];
            }
        }
        return str + "]";
    }
}
