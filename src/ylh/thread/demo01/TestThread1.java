package ylh.thread.demo01;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 11:23
 */
//线程不一定立即执行，由CPU安排调度
public class TestThread1 extends Thread {
    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("run方法线程--" + i);
        }
    }

    public static void main(String[] args) {
        //创建一个线程对象
        TestThread1 thread1 = new TestThread1();
        //start()开启线程
        thread1.start();

        //main主线程
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程--" + i);
        }
    }
//运行结果并发执行,穿插打印
}
/*
Thread类
    自定义线程类 继承Thread类
    重写run()方法，编写线程执行体
    创建线程对象，调用start()方法启动线程
 */