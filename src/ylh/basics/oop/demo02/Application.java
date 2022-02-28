package ylh.basics.oop.demo02;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/23 17:47
 */
public class Application {
    public static void main(String[] args) {
        /*
        Student xiaoming = new Student();
        Student xh = new Student();

        xiaoming.name = "小明";
        xiaoming.age = 3;

        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);

        xh.name = "小红";
        xh.age = 9;

        System.out.println(xh.name);
        System.out.println(xh.age);
        */
        Person person = new Person();

        System.out.println(person.name);
    }
}
