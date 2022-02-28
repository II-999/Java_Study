package ylh.basics.oop.demo01;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/23 17:21
 */
public class Demo02 {
    public static void main(String[] args) {
        Student student = new Student();
        student.say();
    }

    /*
    总结：
    1.静态方法在类加载的时候就已经存在
    2.非静态方法必须在类实例化的时候才会产生（new）
     */
    public void a() {  //a可以直接调用b
        b();
    }

    public void b() {
        a();
    }
}
