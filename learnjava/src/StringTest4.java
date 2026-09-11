import java.util.Scanner;

public class StringTest4 {
    //字符串计算
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int len1 = str1.length(), len2 = str2.length();
        int max = len1 > len2 ? len1 : len2;
        char [] res = new char [max + 1];

        //统一两个char数组的长度
        char [] arr1 = new char [max];
        char [] arr2 = new char [max];
        if(max == len1){
            arr1 = str1.toCharArray();
            int zero = max - len2;
            for(int i = 0; i < zero; i++){
                str2 = "0" + str2;
            }
            arr2 = str2.toCharArray();
        }else{
            arr2 = str2.toCharArray();
            int zero = max - len1;
            for(int i = 0; i < zero; i++){
                str1 = "0" + str1;
            }
            arr1 = str1.toCharArray();
        }

        //实际计算
        int c = 0; //进位
        for(int i = max - 1; i >= 0; i--){
            int num1 = arr1[i] - '0';
            int num2 = arr2[i] - '0';
            int sum = num1 + num2 + c;
            res[i + 1] = (char) (sum % 10 + '0');
            c = sum / 10;
        }
        res[0] = (char)(c + '0');
        String result = new String(res);
        System.out.println(result);
    }
}
