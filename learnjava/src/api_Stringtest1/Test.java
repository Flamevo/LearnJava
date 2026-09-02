package api_Stringtest1;

public class Test {
    static void main(String[] args) {
        //直接赋值
        String a = "abc";
        System.out.println(a);

        //构造方法创建
        String str1 = new String();
        String str2 = new String("abcdefg");

        char[] chs = {'a', 'b', 'c'};
        String str3 = new String(chs);

        byte[] bytes = {97, 98, 99, 100, 101}; //ASCII码
        String str4 = new String(bytes);
        System.out.println(str4);
    }
}
