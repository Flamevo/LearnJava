import java.util.Scanner;

public class StringTest9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int slow = 0, fast = 0;
        StringBuilder res = new StringBuilder();
        while (fast != str.length()) {
            if (str.charAt(fast) > '9' || str.charAt(fast) < '0') {
                res.append(str.charAt(fast));
                fast++;
                slow = fast;
            } else {
                while (str.charAt(fast) <= '9' && str.charAt(fast) >= '0') {
                    fast++;
                    if(fast == str.length()) break;
                }
                String tmp = str.substring(slow, fast);
                res.append("*" + tmp + "*");
            }
        }
        System.out.println(res);
    }
}
