public class OperatorDemo3 {
    public static void main(String[] args){
        short s1 = 100;
        short s2 = 200;
        //00000000 00000000 00000001 01001100 int result = s1 + s2;
        byte result2 = (byte)(s1 + s2);
        System.out.println(result2);
    }
}
