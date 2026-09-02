package api_Stringtest5;

import java.util.Scanner;

public class Test {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();
        int countU = 0, countD = 0, countN = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                countU++;
            }else if(c >= 'a' && c <= 'z'){
                countD++;
            }else if(c >= '0' && c <= '9'){
                countN++;
            }else{
                System.out.println("有其他字符");
                break;
            }
        }
        System.out.println("大写字母有" + countU + "个，小写字母有" + countD + "个，数字字符有" + countN + "个");
    }
}
