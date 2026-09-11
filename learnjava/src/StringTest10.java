import java.util.Random;

public class StringTest10 {
    static void main(String[] args) {
        Random r = new Random();
        char arr[] = new char[52];
        for(int i = 0; i < 26; i++){
            arr[i] = (char)('a' + i);
        }
        for(int i = 0; i < 26; i++){
            arr[i + 26] = (char)('A' + i);
        }
        String str = new String();
        for(int i = 0; i < 4; i++){
            int index = r.nextInt(0, 52);
            str += arr[index];
        }
        int num = r.nextInt(0, 10);
        str += num;
        char array [] = str.toCharArray();
        int index  = r.nextInt(0, 4);
        char tmp = array[index];
        array[index] = array[4];
        array[4] = tmp;
        String res = new String(array);
        System.out.println(res);
    }
}
