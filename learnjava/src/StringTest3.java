import java.util.Scanner;

public class StringTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = str.length() / 8, b = str.length() % 8;
        int n = (b == 0) ? a : a + 1;
        String [] res = new String[n];
        for(int i = 0; i < a; i++){
            String tmp = str.substring(i * 8, (i + 1) * 8);
            res[i] = tmp;
        }
        String rest = str.substring(a * 8);
        StringBuilder sb = new StringBuilder(rest);
        if(b != 0) {
            for (int i = 0; i < (8 - b); i++) {
                sb.append("0");
            }
        }
        res[a] = sb.toString();
        for(int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }
}
