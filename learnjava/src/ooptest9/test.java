package ooptest9;

public class test {
    public static void main(String[] args){
        int [] arr = new int [] {10, 20, 50, 34, 100};
        ArrayUtil.printArr(arr);
        double average = ArrayUtil.getAverage(arr);
        System.out.println(average);
    }
}
