import java.util.Scanner;
public class IfDemo2 {
    public static void main(String[] args){
        /*
        需求：初始最大生命值200，受到X点伤害，技能恢复Y点血，X和Y由键盘录入
        假设，游戏任务不会死亡，最少1点血。
        问：最终游戏任务血量是多少？
        */
       Scanner sc = new Scanner(System.in);
       double hp = 200; 
       double X = sc.nextDouble();
       double Y = sc.nextDouble();
       hp = hp - X + Y;
       if(hp < 1){
        hp = 1;
       }
       System.out.println(hp);
       sc.close();
    }
}
