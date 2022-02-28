package ylh.basics.oop.demo01;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/23 17:22
 */
public class Student {
    //封装：私有-属性，公开-方法！！！！

    public void say(){
        System.out.println("学生说话了");
    }
    //不加访问修饰符默认是default，同包下可以访问
    String name;
    private int age;

    //在没有有参构造时，类会默认生成一个无参构造方法
    public Student() {

    }

    //在声明了有参构造后，如果还想调用无参构造就必须在类中写出无参构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
