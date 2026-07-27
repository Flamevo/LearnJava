import java.util.Scanner;

public class OperatorTest2 {
    public static void main(String[] args){
        int hour = 3600;
        int minute = 60;
        Scanner sc = new Scanner(System.in);
        int second = sc.nextInt();
        int h = second / hour;
        int m = second % hour / minute;
        int s = second % minute;
        System.out.println(h + "小时" + m + "分钟" + s + "秒");
        sc.close();
    }
}
