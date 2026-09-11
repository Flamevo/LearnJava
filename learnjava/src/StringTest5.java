import java.util.Scanner;

public class StringTest5 {
    //数据脱敏
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入邮箱");
        String email = sc.next();
        System.out.println(forEmail(email));
        System.out.println("请输入手机号");
        String number = sc.next();
        System.out.println(forNumber(number));
    }

    public static String forEmail(String email){
        int index = 0;
        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i) == '@'){
                index = i;
                break;
            }
        }
        String res = email;
        if(index > 1) {
            res = email.replace(email.substring(1, index), "***");
        }
        return res;
    }

    public static String forNumber(String number){
        int mid = number.length() / 2;
        String res = number.replace(number.substring(mid - 2, mid + 2), "****");
        return res;
    }
}
