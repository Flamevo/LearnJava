import java.util.Random;

public class ArrTest4 {
    public static void main(String[] args){
        Random r = new Random();
        int arr [] =  new int [10];
        for (int i = 0; i < arr.length;) {
            int num = r.nextInt(0, 101);
            boolean repeat = false;
            for(int j = 0; j < i; j++){
                if(num == arr[j]){
                    repeat = true;
                    break;
                }
            }
            if(!repeat){
                arr[i] = num;
                i++; //只有当填上一个数时循环索引才自增，防止没填入随机数直接为0
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
