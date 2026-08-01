public class ArrTest2 {
    public static void main(String[] args){
        int arr [] = {33, 5, 22, 44, 55};
        int max = arr[0]; //初始化一般为数组第一个
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
