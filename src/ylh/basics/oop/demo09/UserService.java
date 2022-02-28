package ylh.basics.oop.demo09;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/23 21:18
 */
//interface接口,接口都要有继承类
//实现类（implements 可以继承多个接口）
//多继承，利用接口实现多继承
public interface UserService {

    //定义的属性都是常量,默认修饰 public static final
    public static final int AGE = 99; //一般不用

    //所有的定义的方法都是抽象的 默认public abstract
    public abstract void run();

    void add();

    void query();

    void delete();
}
/*
接口(interface)
    普通类：只有具体实现
    抽象类：具体实现和规范(抽象方法)都有
    接口：只有规范，没有方法实现，专业的约束！约束与实现分离：面向接口编程~
    接口就是规范，定义的是一组规则，"你是什么…必须做什么…"的思想。
    接口的本质是约束，就像人间法律一样，制定好大家都遵守。

注意点
    接口没有构造方法，不能被实例化
    实现类必须要重写接口中的方法
    实现类（implements）可以实现多个接口
 */