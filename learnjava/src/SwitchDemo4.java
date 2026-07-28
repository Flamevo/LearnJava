import java.util.Scanner;

public class SwitchDemo4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入运算种类");
        String input = sc.next();
        int a = 10, b = 20;
        int result = switch(input){
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> 9999;
        };
        System.out.println(result);
        sc.close();
    }
}
