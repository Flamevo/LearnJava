public class LoopDemo4 {
    public static void main(String[] args){
        for(int i = 1; i <= 9; i++){
            String line = "";
            for(int j = 1; j <= i; j++){
                int multi = i * j;
                line += j + "x" + i + "=" + multi + '\t';
            }

        // \t制表符 长度可变的大空格，打印表格类数据，可以让上下对齐
            System.out.println(line);
        }
    }
}
