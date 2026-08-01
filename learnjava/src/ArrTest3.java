import java.util.Random;

public class ArrTest3 {
    public static void main(String[] args){
        int arr [] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int random = r.nextInt(0, 10);
            if(random == i) continue;
            int temp = arr[random];
            arr[random] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
