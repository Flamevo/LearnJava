import java.util.Scanner;
public class IfDemo1 {
    public static void main(String[] args){
        //定义一个变量表示人的体温，对体温进行判断是否大于等于38度，如果超过打印警告。
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        
        double threshold = 38;
        if(temp >= threshold){
            System.out.println("体温过高");
        }else{
            System.out.println("体温正常");
        }
        sc.close();
    }
}
