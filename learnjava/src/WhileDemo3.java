public class WhileDemo3 {
    public static void main(String[] args){
        double peak = 8848860;
        int t = 1;
        double height = 0.1;
        while(height < peak){
            height = height * 2;
            t++;
        }
        System.out.println(t);
    }
}
