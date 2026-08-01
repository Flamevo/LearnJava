import java.util.Scanner;

public class ArrTest1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数据");
        int input = sc.nextInt();
        int arr [] = {33, 5, 22, 44, 55, 33};
        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if(input == arr[i]){
                System.out.println("找到目标数据，索引为：" + i);
                b = true;
                break;
            }
        }
        if(!b){
            System.out.println("该数据不存在");
        }
        sc.close();
    }
}
