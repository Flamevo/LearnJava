package polymorphictest1;

public class Test {
    public static void main(String[] args) {
        StudentManager stm = new StudentManager();
        Student stu = new Student("xy", "xiyang", "0819");
        Teacher tea = new Teacher("wyc", "wangyuchen", "0523");
        Admin adm = new Admin("zxy", "zouxingyu", "0602");
        stm.register(stu);
        stm.register(tea);
        stm.register(adm);
    }
}


