package ylh.thread.advanced;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 21:16
 */
// 回顾总结线程的创建
public class TestNew {
    public static void main(String[] args) {
        new MyThread1().start();

        new Thread(new MyThread2()).start();

        FutureTask<Integer> futureTask = new FutureTask(new MyThread3());
        new Thread(futureTask).start();

        Integer integer = null;
        try {
            integer = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(integer);
    }
}

// 1.继承Thread类
class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread1");
    }
}

// 2.实现Runnable类
class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("MyThread2");
    }
}

// 3.实现Callable类
class MyThread3 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("MyThread3");
        return 100;
    }
}

