package polymorphictest2;

public class Test {
    public static void main(String[] args) {
        /*
        变量调用：
                编译看左边，运行也看左边
        方法调用：
                编译看作左边，运行看右边
         */

        //利用多态方式创建对象
        Fu f = new Zi();
        //调用成员变量，编译看左边，运行看左边
        //编译看左边：在把java文件编译成class文件的时候
        //看父类当中有没有这个变量，如果有编译成功
        //运行也看左边：在代码真正运行的时候，使用父类中的变量
        System.out.println(f.name);

        //调用成员方法：编译看左边，运行看右边
        //编译看左边：看父类当中有没有这个方法，如果没有则代码代码报错
        //运行看右边：在代码真正运行的时候，运行的是子类里的方法
        //          如果子类没有重写，则使用的还是父类
        //弊端：多态不能调用子类的特有方法
        f.fuShow();
        f.show();

        //解决多态的弊端
        Zi z = (Zi) f;
        z.ziShow();
        //注意点：
        // 爷爷 爸爸 儿子
        //创建了爸爸的对象， 赋值给了爷爷类型
        //在进行强制类型转换的时候，只能转到爸爸类型，不能转成儿子类型

        Ye y = new Fu();
        //判断一下，y是不是父类类型
        if(y instanceof Fu){
            Fu ff = (Fu)y;
        }else{
            System.out.println("请确定好类型，再进行转换");
        }
    }
}
