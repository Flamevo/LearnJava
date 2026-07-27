import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // //创建Scanner对象
        // Scanner scanner = new Scanner(System.in);

        // //接受键盘录入
        // int num = scanner.nextInt(); //int型   
        // System.out.println(num);
        
        // double d = scanner.nextDouble(); //double型
        // System.out.println(d);

        // String str = scanner.next(); //String型
        // System.out.println(str);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入第一个整数");
        int num1 = scanner.nextInt();

        System.out.println("请录入第二个整数");
        int num2 = scanner.nextInt();
        
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
