public class BreakDemo1 {
    public static void main(String[] args){
       for(int i = 1; i <= 100; i++){
        if(i == 15){
            break; //到break关键字 循环直接结束
        }
        System.out.println(i);
       } 
    }
}
