package FightGame.ui;

import FightGame.bean.User;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Login {
    public Login() {
    }

    public void start(){
        System.out.println("╔════════════════════════════════╗");
        System.out.println("      🎮 欢迎来到文字格斗游戏 🎮      ");
        System.out.println("╚════════════════════════════════╝");

        ArrayList<User> userlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请选择操作：1登录 2注册 3退出");
            int op = sc.nextInt();
            if(op == 1){
                login(userlist);
            }else if(op == 2){
                signup(userlist);
            }else if(op == 3){
                break;
            }else{
                System.out.println("请输入1 ~ 3的数字");
            }
        }
    }

    private boolean login(ArrayList<User> userlist){
        if(userlist.size() == 0){
            System.out.println("系统注册列表为空，请先注册");
            return false;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        boolean usernameFlag = false;
        int index = 0;
        for(int i = 0; i < userlist.size(); i++){
             if(userlist.get(i).getUsername().equals(username)){
                 usernameFlag = true;
                 index = i;
             }
        }
        User tmp = userlist.get(index);
        if(!usernameFlag){
            System.out.println("用户名未注册，请先注册");
            return false;
        }else if(!tmp.getState()){
            System.out.println("用户" + tmp.getUsername() + "已被锁定");
            return false;
        }else{
            System.out.println("请输入密码");
            String password = sc.next();
            String code = Generator();
            System.out.println("请输入验证码" + code);
            String inputCode = sc.next();
            while(!inputCode.equals(code)){
                code = Generator();
                System.out.println("验证码错误请重新输入" + code);
                inputCode = sc.next();
            }
            if(password.equals(tmp.getPassword())){
                System.out.println("登录成功");
                return true;
            }else{
                int count = 3;
                while(count > 0){
                    System.out.println("密码错误，还有" + count + "次重试机会");
                    password = sc.next();
                    if(password != tmp.getPassword()){
                        count--;
                    }else{
                        System.out.println("登录成功");
                        return true;
                    }
                }
                userlist.get(index).setState(false);
                return false;
            }
        }
    }

    private void signup(ArrayList<User> userlist){
        Scanner sc = new Scanner(System.in);
        User user = new User();

        //用户名部分注册
        System.out.println("请输入要注册的用户名");
        String username = sc.next();
        while(true){
            boolean usernameFlag = false; //记录是否list里是否存在同名账户
            for(int i = 0; i < userlist.size(); i++){
                if(username.equals(userlist.get(i).getUsername())) usernameFlag = true;
            }
            if(usernameFlag){
                System.out.println("用户名重复，请重新输入");
                username = sc.next();
            }else{
                boolean isSetUsername = user.setUsername(username);
                while(!isSetUsername){
                    System.out.println("用户名不符合要求，请重新输入");
                    username = sc.next();
                    isSetUsername = user.setUsername(username);
                }
                break;
            }
        }

        //密码部分注册
        boolean passwordFlag = false;
        while(true) {
            System.out.println("请输入密码");
            String password1 = sc.next();
            System.out.println("请再次输入密码");
            String password2 = sc.next();
            if(password1.equals(password2)){
                passwordFlag = true;
            }else{
                System.out.println("两次密码输出不一致");
                continue;
            }
            if(passwordFlag){
                boolean isSetPassword = user.setPassword(password1);
                if(!isSetPassword) {
                    continue;
                }else{
                    break;
                }
            }
        }
        userlist.add(user);
        System.out.println("注册成功");
    }

    private String Generator(){
        Random r = new Random();
        //定义大小写字母库
        char [] arr = new char [52];
        for(int i = 0; i < 26; i++){
            arr[i] = (char)('a' + i);
        }
        for(int i = 0; i < 26; i++){
            arr[i + 26] = (char)('A' + i);
        }

        //定义字符串存储随机字母字符
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 4; i++){
            int index = r.nextInt(0, 52);
            sb.append(arr[index]);
        }
        int num = r.nextInt(0, 10);
        int insertIndex = r.nextInt(0, 5);
        sb.insert(insertIndex, num);
        String res = sb.toString();
        return res;
    }
}
