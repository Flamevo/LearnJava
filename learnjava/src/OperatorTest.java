import java.util.Scanner;
public class OperatorTest {
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();
        int bai = num / 100;
        int shi = num % 100 / 10;
        int ge = num % 10;
        System.out.println("百位数是：" + bai + "十位数是：" + shi + "个位数是：" + ge );
    }
}
