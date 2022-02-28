package ylh.thread.demo01;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 15:14
 */
public class TestThread3 implements Runnable {
    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 200; i++) {
            System.out.println("run方法线程--" + i);
        }
    }

    public static void main(String[] args) {
        //创建一个线程对象
        TestThread3 thread3 = new TestThread3();

        // Thread thread = new Thread(thread3);
        // thread.start();
        // 等效于下面一行的代码
        new Thread(thread3).start();

        //main主线程
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程--" + i);
        }
    }
}
/*
Runnable接口
    自定义线程类实现Runnable接口
    实现run()方法,编写线程执行体
    创建线程对象,调用start()方法启动对象
    推荐使用Runnable对象,因为Java单继承的局限性
 */
