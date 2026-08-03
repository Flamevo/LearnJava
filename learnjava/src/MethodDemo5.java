public class MethodDemo5 {
    public static void main(String[] args){
        String a = "Hello", b = "World";
        int c = 10, d = 20;
        double e = 3.14159, f = 1.414;
        System.out.println(sum(a, b));
        System.out.println(sum(c, d));
        System.out.println(sum(e, f));
    }
    //方法重载一般不写成顺序不同的，会导致编译器报错

    public static int sum(int a, int b){
        int res = a + b;
        return res;
    }
    public static double sum(double a, double b){
        double res = a + b;
        return res;
    }
    public static String sum(String a, String b){
        String res = a + b;
        return res;
    }
}
