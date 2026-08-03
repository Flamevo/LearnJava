import java.util.Scanner;

public class MethodTest1 {
    public static int [] InputNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请五位评委输入分数");
        int arr [] = new int [5];
        for(int i = 0; i < arr.length; ){
            int num = sc.nextInt();
            if(num >= 0 && num <= 100){
                arr[i] = num;
                i++;
            }else{
                System.out.println("当前分数超出范围");
            }
        }
        return arr;
    }

    public static int [] GetMaxMin(int arr[]){
        int max = arr[0], min = arr[0];
        int res [] = new int [2];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        res[0] = max;
        res[1] = min;
        return res;
    }

    public static int Sum(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double GetAvg(int sum, int max, int min){
        double res = (sum - max - min) / 3;
        return res;
    }
    public static void main(String[] args){
        int score[] = InputNumber();
        int maxmin[] = GetMaxMin(score);
        int sum = Sum(score);
        double res = GetAvg(sum, maxmin[0], maxmin[1]);
        System.out.println(res);
    }
}
