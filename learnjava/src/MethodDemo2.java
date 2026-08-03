import java.util.Random;

public class MethodDemo2 {
    public static int[] getArr(){
        Random r = new Random();
        int res [] = new int [10];
        for (int i = 0; i < res.length;) {
            int num = r.nextInt(1, 10);
            boolean repeat = false;
            for(int j = 0; j < i; j++){
                if(num == res[j]){
                    repeat = true;
                    break;
                }
            }
            if(!repeat){
                res[i] = num;
                i++;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int res[] = getArr();
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
