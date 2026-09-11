import java.util.Scanner;

public class StringTest6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(c == str.charAt(i)){
                count++;
            }
        }
        System.out.println("字符" + c + "出现的次数为" + count);
    }
}
