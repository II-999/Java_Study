package ylh.basics.oop.demo05;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/23 19:44
 */
public class Person {
    private int money = 10_000_000;
    protected String name = "ylh";

    public void print(){
        System.out.println("Person");
    }
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void say(){
        System.out.println("说了一句话");
    }
}
/*
继承
    继承的本质是对某一批类的抽象，从而实现对世界更好地建模。
    extends的意思是”扩展“。子类是父类的扩展，使用关键字extends来表示。
    Java中类只有单继承，没有多继承！一个类只能继承一个父类。
    继承是类与类之间的一种关系，此外还有依赖、组合、聚合等。
继承关系的两个类，一个为子类（派生类），一个为**父类（基类）**子类继承父类。
    子类和父类之间，从意义上讲应该具有”is a“的关系。
*/

/*
继承
    子类继承了父类，就会拥有父类的全部方法，而private私有属性及方法无法继承。
    在Java中，所有类，都默认直接或间接继承Object类 (Ctrl+H 可以查看类关系)
    被final修饰的类，无法被继承（断子绝孙）。
super & this
    super()调用父类的构造方法，必须在构造方法的第一个
    super必须只能出现在子类的方法或构造方法中
    **super()和this()**不能同时调用构造方法，因为this也必须写在第一行
    super与this的区别：super代表父类对象的引用，只能在继承条件下使用；this调用自身对象，没有继承也可以使用。
*/