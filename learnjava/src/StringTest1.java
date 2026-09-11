import java.util.Scanner;

public class StringTest1 {
    //字符串拼接
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度");
        int len = sc.nextInt();
        int [] arr = new int [len];
        System.out.println("请输入数组内容");
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1) {
                sb.append(arr[i] + ", ");
            }else if(i == arr.length - 1){
                sb.append(arr[i] + "]");
            }
        }
        System.out.println(sb);
    }
}
