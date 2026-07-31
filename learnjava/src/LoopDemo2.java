import java.util.Scanner;

public class LoopDemo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数");
        int row = sc.nextInt();
        // System.out.println("请输入列数");
        // int col = sc.nextInt();
        System.out.println("正三角");
        for(int i = 1; i <= row; i++){
            String line = "";
            for(int j = 1; j <= i; j++){
                line += "*";
            }
            System.out.println(line);
        }
        System.out.println("倒三角");
        for(int i = 1; i <= row; i++){
            String line = "";
            for(int j = row; j >= i; j--){
                line += "*";
            }
            System.out.println(line);
        }
    }
}
