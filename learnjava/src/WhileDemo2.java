public class WhileDemo2 {
    public static void main(String[] args){
        //复利计算器
        int year = 0;
        double invest = 100000;
        double expectmoney = 2 * invest;
        while(invest < expectmoney){
            year++;
            invest = invest + invest * 0.017;
        }
        System.out.println(year);
    }
}
