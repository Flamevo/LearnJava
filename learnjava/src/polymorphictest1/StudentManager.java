package polymorphictest1;

public class StudentManager {
    public void register(Person person){
        System.out.println("姓名为" + person.getName() + "的账户注册成功，账号为" + person.getUsername() + "，密码为" + person.getPassword());
    }
}
