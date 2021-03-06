package ylh.basics.oop.demo08;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/23 21:14
 */
//abstract 抽象类 类只能单继承（接口可以多继承）
public abstract class Action {

    //约束~有人帮我们实现~
    //抽象方法只有方法名，没有方法的实现
    public abstract void doSth();

    //1.不能new抽象类，只能靠子类去实现它，仅作为一个约束
    //2.抽象方法只能出现在抽象类中，抽象类可以有普通方法
    //3.抽象类有构造器，可以派生子类
    //4.抽象类的意义：约束，提高开发效率。但是类只能单继承，所以有局限 用的不多
}
/*
抽象类(abstract)
    abstract修饰的类就是抽象类，修饰的方法就是抽象方法。
    抽象类中可以没有抽象方法，但有抽象方法的类一定要声明为抽象类。
    抽象类不能使用new来创建对象，它是用来让子类继承的。
    抽象方法只有方法的声明，没有实现，让其子类实现。
    子类继承抽象类，必须实现抽象类的所有方法，否则该子类也要声明为抽象类。
 */