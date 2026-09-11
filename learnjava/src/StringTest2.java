import java.util.Scanner;

public class StringTest2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入一个字符串 ");
            String str = sc.next();
            if (str.equals("拜拜")) {
                break;
            } else {
                StringBuilder sb = new StringBuilder(str);
                sb.reverse();
                String res = sb.toString();
                System.out.println(res);
            }
        }
    }
}
