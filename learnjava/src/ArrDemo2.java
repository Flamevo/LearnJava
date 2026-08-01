public class ArrDemo2 {
    public static void main(String[] args){
        int arr[] = {0, 1, 2, 3, 4};
        for(int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }
        arr[3] = 1000;
        for(int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }
    }
}
