package ylh.basics.exception.demo02;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 10:05
 */
public class Test {
    public static void main(String[] args) {
        try {
            test(11);
        } catch (MyException e) {
            System.out.println("MyException=>" + e);
            e.printStackTrace();
        }
    }

    //可能存在异常的方法
    public static void test(int a) throws MyException {
        System.out.println("传递参数为:" + a);
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("OK");
    }
}
