package extendstest6;

public class test {
    public static void main(String[] args) {
        Device d1 = new Device();
        d1.price = 4000;
        Phone p1 = new Phone();
        p1.price = 1000;
        double priced = d1.payment();
        double pricep = p1.payment();
        System.out.print(priced + " " + pricep);
    }
}

/*
* 1.如果父类里的代码，一行都不需要用，此时把子类中的方法题重新定义即可
* 2.如果父类里面的代码还想用，此时只是再弗雷德基础上再加上其他的逻辑
* 可以先用super关键字调用父类的方法得到一个结果，再对这个结果计算
* */

class Device{
    String name;
    double price;

    public double payment(){
        if(price >= 10000){
            return price * 0.7;
        }else if(price < 10000 && price >= 5000){
            return price * 0.8;
        }else if(price < 5000 && price >= 1000){
            return price * 0.9;
        }else if (price >= 0){
            return price;
        }
        return 0;
    }
}

class Phone extends Device{
    @Override
    public double payment(){
        price = super.payment();
        price *= 0.9;
        return price;
    }
}

class PC extends Device{

}

