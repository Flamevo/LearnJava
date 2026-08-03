import java.util.Scanner;

public class MethodDemo4 {
    public static boolean IsLarger(int h1, int w1, int h2, int w2){
        int s1 = h1 * w1;
        int s2 = h2 * w2;
        return s1 > s2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个长方形的长和宽");
        int h1 = sc.nextInt(), w1 = sc.nextInt();
        System.out.println("请输入第二个长方形的长和宽");
        int h2 = sc.nextInt(), w2 = sc.nextInt();
        if(IsLarger(h1, w1, h2, w2)){
            System.out.println("第一个长方形面积更大");
        }else{
            System.out.println("第二个长方形面积更大");
        }
    }
}
