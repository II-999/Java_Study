package ylh.basics.oop.demo07;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/23 21:01
 */

//静态导入包

import static java.lang.Math.random;

public class Person {
    //2：赋初值
    {
        //匿名代码块
        System.out.println("匿名代码块");
    }

    //1：只执行一次
    static {
        //匿名代码块
        System.out.println("静态代码块");
    }

    //3
    public Person() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("======================");
        Person person2 = new Person();

        //第一种随机数，不用导包
        System.out.println(Math.random());

        //第二种随机数，静态导入包
        System.out.println(random());
    }
}
