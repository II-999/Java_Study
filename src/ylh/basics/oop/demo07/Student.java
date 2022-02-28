package ylh.basics.oop.demo07;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/23 20:51
 */
public class Student {
    private static int age;
    private double score;

    public void run() {

    }

    public static void go() {

    }

    public static void main(String[] args) {
        //run(); 报错
        go();

        Student s1 = new Student();

        System.out.println(Student.age);
        //System.out.println(Student.score); 报错
        System.out.println(s1.age);
        System.out.println(s1.score);
    }
}
