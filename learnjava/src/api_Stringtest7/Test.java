package api_Stringtest7;

public class Test { //数据脱敏
    static void main(String[] args) {
        String str = "abcdefg";
        char first = str.charAt(0);
        String res = first + "***";
        System.out.println(res);
    }
}
