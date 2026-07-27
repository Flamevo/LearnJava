public class Variabledemo2 {
    public static void main(String[] args) {
        //我方a
        double attacka = 220;
        double defensea = 85;
        double hpa = 1012.5;
        double skilla = 1.2;

        //敌方b
        double attackb = 210;
        double defenseb = 80;
        double hpb = 1223.3;
        double skillb = 1.3;

        //我方第一次进行普通攻击，造成多少伤害，对方还剩多少血量
        double damagea1 = attacka - defenseb;
        hpb = hpb - damagea1;
        System.out.println("我方第一次普通攻击造成伤害：" + damagea1 + "，敌方剩余血量：" + hpb);   

        //我方第二次进行技能攻击，造成多少伤害，对方还剩多少血量
        double damagea2 = attacka * skilla - defenseb;
        hpb = hpb - damagea2;
        System.out.println("我方第二次技能攻击造成伤害：" + damagea2 + "，敌方剩余血量：" + hpb);   
        
        int a ,b ,c;
        a = b = c =10;
        System.out.println("a=" + a + ",b=" + b + ",c=" + c);

    }
}