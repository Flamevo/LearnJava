public class ArrDemo5 {
    public static void main(String[] args){
        //快慢指针
        //慢指针：存入的位置， 快指针：找不重复的元素
        //相等则舍弃快指针位置的数据
        //不等 快指针的数据存入慢指针位置
        int arr [] = {1, 1, 2, 2, 2, 3, 3, 3, 3, 4 , 5, 5, 6};
        int slow = 0, fast = 1;
        while(fast < arr.length){
            if(arr[fast] != arr[slow]){
                slow++;
                arr[slow] = arr[fast];
            }
            fast++;
        }
        for (int i = 0; i <= slow; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
