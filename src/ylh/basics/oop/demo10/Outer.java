package ylh.basics.oop.demo10;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/23 21:30
 */
public class Outer {
    private int id;

    // 成员内部类
    public class Inner1 {
        public void in() {
            System.out.println("这是内部类的方法");
        }

        public void getID() {
            System.out.println(id);
        }
    }
    // Outer outer = new Outer();
    // Outer.Inner1 inner1 = outer.new Inner1();
    // inner1.in();

    // 静态内部类
    public static class Inner2 {
        public void in() {
            System.out.println("这是内部类的方法");
        }

        public void getID() {
            //System.out.println(id); 报错，不能访问外部类私有属性
        }
    }

    public void out() {
        System.out.println("这是外部类的方法");
        //局部内部类
        class Inner3 {
            public void in() {
                System.out.println("这是局部内部类");
            }
        }
    }
    // 匿名内部类
    // new Student().test2();
}

class A {
    public static void main(String[] args) {

    }
}
/*
内部类
    内部类就是在一个类的内部再定义一个类，比如A类中定义了一个B类，那么B就是A的内部类，而A相对B来说就是外部类
    成员内部类：可以操作外部类的私有属性及方法
    静态内部类：static修饰，不能访问外部类私有属性
    局部内部类：外部类的方法里定义的类
    匿名内部类：没有名字初始化类
 */