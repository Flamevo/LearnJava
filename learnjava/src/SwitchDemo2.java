import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args){
        /*
        1.default 和 case没有标准上下之分
        位置任意书写
         */
        /*
        2.case穿透
            写代码时，break没有写
        执行流程：
            1.拿着小括号中表达式的值跟下面的case进行匹配
            2.如果匹配上了，就会执行case里的语句体，遇到break结束整个switch
            3.如果在执行语句体的时候没有看到break，那么程序会执行下一个case的语句
            体，直到遇到break或者运行完整个switch
        应用场景：
            当多个case语句体重复时
            */

        //case穿透应用
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = sc.nextInt();
        switch(month){
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
        }
    }
}
