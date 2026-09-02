package api_Stringtest2;

public class Test {
    public static void main(String[] args) {
         String str1 = "ABC";
         String str2 = "abc";
         String str3 = new String("abc");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str2.equals(str3));
    }
}
