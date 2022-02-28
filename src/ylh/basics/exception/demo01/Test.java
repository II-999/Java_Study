package ylh.basics.exception.demo01;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 9:52
 */
public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {  //try监控区域
            System.out.println(a / b);
        } catch (ArithmeticException e) { //catch 捕获异常
            e.printStackTrace();
            System.out.println("异常，不能除0");
        } finally {//处理善后工作
            System.out.println("不管有没有异常都会执行。");
        }
    }
}
