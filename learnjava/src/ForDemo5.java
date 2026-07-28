import java.util.Scanner;

public class ForDemo5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字表示一个范围");
        int min = sc.nextInt();
        int max = sc.nextInt();
        int count = 0;
        for(int i = min; i <= max; i++){
            if(i % 3 == 0 && i % 5 == 0){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
