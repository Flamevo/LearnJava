package FightGame.bean;

import java.util.Random;

public class User {
    private String id;
    private String username;
    private String password;
    private boolean state;

    public User() {
    }

    public User(String username, String password){
        id = IdGenerator();
        state = true;
        this.username = username;
        this.password = password;
    }

    public String getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public boolean getState(){
        return state;
    }

    public boolean setUsername(String username){
        boolean flag = UsernameTest(username);
        if(flag){
            this.username = username;
        }
        return flag;
    }

    public boolean setPassword(String password){
        boolean flag = PasswordTest(password);
        if(flag){
            this.password = password;
        }
        return flag;
    }

    //生成随机id
    private String IdGenerator(){
        Random r = new Random();

        //前5为默认为"heima"
        String str = "heima";
        int num = r.nextInt(10000, 100000);
        str += num;
        return str;
    }

    //判断用户名是否合法
    private boolean UsernameTest(String username){
        boolean flag;
        if(username == null){
            flag = false;
            System.out.println("用户名不可为空");
            return false;
        }
        if(username.length() < 3 || username.length() > 16){
            flag = false;
            System.out.println("用户名长度必须在3 ~ 16位");
            return flag;
        }
        int count = 0;
        for(int i = 0; i < username.length(); i++){
            if( //只能由字母和数字组成
                    (username.charAt(i) < 'a' || username.charAt(i) > 'z') &&
                    (username.charAt(i) < 'A' || username.charAt(i) > 'Z') &&
                    (username.charAt(i) < '0' || username.charAt(i) > '9')
            ) {
                flag = false;
                System.out.println("用户名只能由字母、数字组成");
                return flag;
            }else if(username.charAt(i) >= '0' && username.charAt(i) <= '9'){
                count++;
                if(count == username.length()){
                    flag = false;
                    System.out.println("用户名不能为纯数字");
                    return flag;
                }
            }
        }
        return true;
    }

    private boolean PasswordTest(String password){
        boolean flag;
        if(password == null){
            flag = false;
            System.out.println("密码不可以为空");
            return false;
        }
        if(password.length() < 3 || password.length() > 8){
            flag = false;
            System.out.println("密码长度要在3 ~ 8位");
        }
        int count = 0;
        for(int i = 0; i < password.length(); i++){
            if( //只能由字母和数字组成
                (password.charAt(i) < 'a' || password.charAt(i) > 'z') && (password.charAt(i) < 'A' || password.charAt(i) > 'Z') && (password.charAt(i) < '0' || password.charAt(i) > '9')
            ) {
                flag = false;
                System.out.println("用户名只能由字母、数字组成");
                return flag;
            }else if(password.charAt(i) >= '0' && password.charAt(i) <= '9'){
                count++;
            }
            if(count == 0){

            }

        }
        return true;
    }
}
