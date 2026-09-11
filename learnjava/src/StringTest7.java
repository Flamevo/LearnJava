import java.util.Scanner;

public class StringTest7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //next()输入不了空格
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rstr = sb.toString();
        int len = 0;
        for(int i = 0; i < rstr.length(); i++){
            if(rstr.charAt(i) == ' ') {
                len = i;
                break;
            }
        }
        System.out.println(len);
    }
}
