package ylh.basics.oop.demo01;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/23 17:39
 */
public class Demo05 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);

        Demo05.change(person);

        System.out.println(person.name);
    }
    public static void change(Person person) {
        person.name = "ylh";
    }
}
class Person{
    String name;
}