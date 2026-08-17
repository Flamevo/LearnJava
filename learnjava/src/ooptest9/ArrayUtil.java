package ooptest9;

public class ArrayUtil {
     private ArrayUtil(){}

     public static void printArr(int [] nums){
         for (int i = 0; i < nums.length; i++) {
             System.out.print(nums[i] + " ");

         }
         System.out.print('\n');
     }

    public static int sum(int [] nums){
         int res = 0;
         for (int i = 0; i < nums.length; i++) {
             res += nums[i];
         }
         return res;
     }

    public static double getAverage(int [] nums){
         int nsum = sum(nums);
         int res = nsum / nums.length;
         return res;
     }
}
