import java.util.Scanner;

public class StringTest8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        String year, month, day, gender;
        char gend;
        year = id.substring(6, 10);
        month = id.substring(10, 12);
        day = id.substring(12, 14);
        gend = id.charAt(16);
        int num = gend - '0';
        if(gend % 2 == 0){
            gender = "女";
        }else{
            gender = "男";
        }
        System.out.println("出生年月日：" + year + "年" + month + "月" + day + "日");
        System.out.println("性别为：" + gender);
    }
}
