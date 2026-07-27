import java.util.Scanner;

public class operatorDemo6 {
    public static void main(String[] args){
        //test1 键盘录入一个四位整数，判断这个整数是否是回文数
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int qian = input1 / 1000;
        int bai = input1 % 1000 / 100;
        int shi = input1 % 100 / 10;
        int ge = input1 % 10 ;
        System.out.println(qian + " " + bai + " " + shi + " " + ge);
        if(qian == ge && bai == shi){
            System.out.println("该数是回文数");
        }else{
            System.out.println("该数不是回文数");
        }

        //test2 寻找7的有缘数，定义一个两位数，只要该数字包含7或者是7的倍数，就是7的有缘数
        int input2 = sc.nextInt();
        int first = input2 / 10;
        int second = input2 % 10;
        if(first == second || input2 % 7 == 0){
            System.out.println(input2 + "是7的有缘数");
        }
        sc.close();
    }
}
