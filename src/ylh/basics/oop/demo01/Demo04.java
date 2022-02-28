package ylh.basics.oop.demo01;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/23 17:38
 */
public class Demo04 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);

        Demo04.change(a);

        System.out.println(a);
    }

    public static void change(int a) {
        a = 10;
    }
}
