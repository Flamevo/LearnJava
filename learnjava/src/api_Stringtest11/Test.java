package api_Stringtest11;

public class Test {
    static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        System.out.println("---" + sb1+ "@@@");
        int len = sb1.length();
        System.out.println(len);

        StringBuilder sb2 = new StringBuilder("abc");
        sb2.append("aaa");
        sb2.reverse(); //直接对sb2做操作
        System.out.println(sb2);
        String res = sb2.toString();
        System.out.println(res);
    }
}
