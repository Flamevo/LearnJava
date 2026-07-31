import java.util.Scanner;

public class LoopDemo3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入平行四边形型的行数");
        int row = sc.nextInt();
        System.out.println("请输入平行四边形的列数");
        int col = sc.nextInt();
        for(int i = 1; i <= row; i++){
            String line = "";
            for(int k = 1; k <= row - i; k++){
                line += " ";
            }
            for(int j = 1; j <= col; j++){
                line += "*";
            }
            System.out.println(line);
        }
    }
}
