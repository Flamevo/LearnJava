import java.util.Scanner;
public class IfDemo3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double score = sc.nextDouble();
        
        if(score >= 0 && score <= 100){
            System.out.println("成绩合理");
            if(score >= 60){
                System.out.println("恭喜你，及格了");
            }else
            System.out.println("很抱歉，不及格");
        }else{
            System.out.println("成绩不合理");
        }
        sc.close();
    }
}
