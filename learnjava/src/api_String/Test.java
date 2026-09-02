package api_String;

import java.util.Random;

/*
在什么情况下，不需要导包：
    1.使用本包中的类
    2.使用java.lang包下的类
 */

public class Test {
    static void main(String[] args) {
        Random r = new Random();

        double num1 = r.nextDouble(); //[0.0, 1.0)
        System.out.println(num1);

        double num2 = r.nextDouble(20.0); //[0.0, bound)
        System.out.println(num2);
//
//        double num3 = r.nextDouble(15.0, 20.0);
//        System.out.println(num3);

        for (int i = 0; i < 10; i++) {
            double num3 = r.nextDouble(15.0, 20.0);
            System.out.println(num3);
        }
    }
}
