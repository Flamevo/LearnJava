public class ArrTest5 {
    public static void main(String[] args){
        int arr1 [] = {1, 3, 5, 7, 9};
        int arr2 [] = {2, 4 ,6, 8, 10};
        int len = arr1.length + arr2.length;
        int arr3 [] = new int [len];
        int a = 0, b = 0, c = 0;
        while(a < arr1.length && b < arr2.length){
            if(arr2[b] > arr1[a]){
                arr3[c] = arr1[a];
                c++;
                a++;
            }else{
                arr3[c] = arr2[b];
                c++;
                b++;
            }
        }
        if(a == arr1.length){
            while(c < arr3.length && b < arr2.length){
                arr3[c] = arr2[b];
                c++;
                b++;
            }
        }else{
            while(c < arr3.length && a < arr1.length){
                arr3[c] = arr1[a];
                c++;
                a++;
            }
        }
        for(int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }
    }
}
