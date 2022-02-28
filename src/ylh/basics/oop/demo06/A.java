package ylh.basics.oop.demo06;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/23 20:12
 */
public class A extends B { //继承
    @Override //重写了B的方法
    public void test() {
        System.out.println("A==>test()");
    }
}

/*
方法的重写
    重写：子类的方法必须与父类方法必须一致，方法体不同。
    重写是方法的重写，与属性无关
    重写方法只与非静态方法有关，与静态方法无关（静态方法不能被重写）
    静态方法属于类，非静态方法属于对象
注意点：
    方法名、参数列表必须相同
    修饰符范围可以扩大，不能缩小（public>protect>private）
    抛出的异常 范围可以被缩小，不能扩大
    被**static(属于类，不属于实例)，final(常量方法)，private(私有)**修饰的方法不能重写
 */

/*
多态
    动态编译：类型
    即同一方法可以根据发送对象的不同而采用不同的行为方式
    一个对象的实际类型是确定的，但可以指向对象的引用可以有很多

多态存在条件
    有继承关系
    子类重写父类方法
    父类引用指向子类对象

注意点：
    多态是方法的多态，没有属性的多态
    父类和子类，有联系 类型转换异常: ClassCastException
    存在条件：继承关系，方法需要重写，父类引用指向子类对象！

Student s1 = new Student();
Person s2 = new Student();
Object s3 = new Student();
 */

/*
instanceof和类型转换
    instanceof 引用类型比较，判断一个对象是什么类型
public static void main(String[] args) {
    // Object > String
    // Objest > Person > Student
    // Objest > Person > Teacher
    Object object = new Student();
	// X instanceof Y，X引用指向的对象是不是Y的子类
    System.out.println(object instanceof Student); //true
    System.out.println(object instanceof Person); //true
    System.out.println(object instanceof Teacher); //false
    System.out.println(object instanceof Object); //true
    System.out.println(object instanceof String); //false

    //类型之间的转化：父-子（高-低）,低可以转换为高
    Person obj = new Syudent(); //只能用Person方法（重写了用子类重写过的方法）
    (Syudent)obj.go(); //强转之后可以用Student方法(Student->go())
}

类型转换
    父类引用指向子类的对象
    把子类转换为父类，向上转型，会丢失自己原来的一些方法
    把父类转换为子类，向下转型，强制转换，才调用子类方法
    方便方法的调用(转型)，减少重复的代码，简洁。
 */