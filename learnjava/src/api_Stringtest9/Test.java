package api_Stringtest9;

import java.util.Locale;

public class Test {
    static void main(String[] args) {
        String str = "abcdefgh";
        //是否包含 contains
        boolean b = str.contains("abcd"); //一定是要连续字串存在
        System.out.println(b);

        //判断开头、结尾 startsWith/endsWith
        String file = "a.txt";
        boolean abc = str.startsWith("abc", 1); //后面参数是从指定索引开始查找
        System.out.println(abc);
        boolean txt = file.endsWith(".txt");
        System.out.println(txt);

        //查找 indexOf(int ch)
        //查找当前字符/字符串 第一次出现的索引 indexOf
        //如果当前要查找的内容不存在，方法会返回-1
        int ch = 'a';
        int i = str.indexOf(ch);
        System.out.println(i);
        int ii = str.lastIndexOf(ch); //最后一次出现的索引
        System.out.println(ii);

        //判断是否为空， isEmpty()
        boolean empty = str.isEmpty();
        System.out.println(empty);

        String str2 = "";
        boolean empty1 = str2.isEmpty();
        System.out.println(empty1);

        //转字符数组 toCharArray()
        String str3 = "abcd";
        char [] array = str3.toCharArray();
        for(int j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }

        //大小写转换 toUpperCase() toLowerCase()
        String lower = "abcdefg";
        String upper = "ABCDEFG";
        String lowertoupper = lower.toUpperCase();
        String uppertolower = upper.toLowerCase();
        System.out.println(lowertoupper);
        System.out.println(uppertolower);

        //去除头尾空格 trim()
        String t = " a b c ";
        System.out.println(t.trim());
    }
}
