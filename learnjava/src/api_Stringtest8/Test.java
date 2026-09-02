package api_Stringtest8;

import java.util.Scanner;

public class Test {
    static void main(String[] args) {
        String[] arr = {"CNM", "TMD", "SB", "NMD"};
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = 0; i < arr.length; i++) {
            str = str.replace(arr[i], "***");
        }
        System.out.println(str);
    }
}
