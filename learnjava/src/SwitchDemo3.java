public class SwitchDemo3 {
    public static void main(String[] args){
        /*
        switch新特性:
            1.箭头标签
            2.case后面可以写多个值
            3.switch可以有运行结果
            4.yield关键词
        */

        int number = 3;
        // switch(number){
        //     case 1 -> {//不会出现case穿透
        //         System.out.println("一");
        //     } 
        //     case 2 -> {
        //         System.out.println("二");
        //     }
        //     default -> System.out.println("三");
        //     case 3, 4 -> System.out.println("四");
        // }

        //yield关键词
        String week = switch(number){
            case 1 -> {
                yield "一";
            }
            case 2 -> {
                yield "二";
            }
            case 3 -> {
                yield "三";
            }
            case 4 -> {
                yield "四";
            }
            /*
            省略方法
                case 4 -> "四";
            */
            default -> {
                yield "没有这个星期";
            }
        }; //注意最后分号
        System.out.println(week);
    }
}
