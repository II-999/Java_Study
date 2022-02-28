package ylh.basics.oop.demo03;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/23 19:22
 */
public class Application {
    public static void main(String[] args) {
        Pet dog = new Pet();

        dog.name = "旺财";
        dog.age = 3;
        dog.shout();
    }
}
