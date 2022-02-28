package ylh.basics.oop.demo02;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/23 17:54
 */
public class Person {
    public String name;

    public Person() {
        this.name = "yinglinghao";
    }

    public Person(String name) {
        this.name = name;
    }
}
/*
创建与初始化对象
使用new来创建对象。
使用new关键字创建的时候，除了分配内存之外，还会给创建好的对象进行默认的初始化，以及对类中构造器的调用。
类中的构造器也被称为构造方法，创建对象时必须要调用。有以下特点：
必须和类的名字相同
没有返回类型，也不能写void
一个类即使什么都不写，也会存在一个默认的构造方法
alt + insert
*/
