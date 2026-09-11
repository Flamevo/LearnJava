package api_Stringtest10;

public class Test {
    static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s = s + "abc";
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1); //ms


        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 100000; i++){
            sb.append("abc");
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);
    }
}
