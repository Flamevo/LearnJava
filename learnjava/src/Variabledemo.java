public class Variabledemo {
    public static void main(String[] args) {
        //定义变量
        double wechat = 0;
        double alipay = 10;
        double card = 20;
        double sum;
        
        //计算
        sum = wechat + alipay + card;
        wechat = wechat + 10 - 2;
        System.out.println(sum + "," + wechat); //中间如果是字符会加为ascii码值
    }
}
