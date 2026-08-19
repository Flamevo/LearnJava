package extendstest1;

public class test {
    public static void main() {
        Student stu1 = new Student("xiyang", 23, "master");
        Teacher teacher1 = new Teacher("chenliang", 33, "AI");

        stu1.eat();
        stu1.learn();

        teacher1.eat();
        teacher1.teach();
    }
}
