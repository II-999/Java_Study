package ylh.basics.oop.demo05;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/23 19:44
 */
public class Student extends Person {
    private String name = "应灵昊";

    public void print() {
        System.out.println("Student");
    }

    public void test(String name) {
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public void test2() {
        print();
        this.print();
        super.print();
    }
}
