package ylh.thread.state;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 16:38
 */
public class TestYield {
    public static void main(String[] args) {
        MyYield myYield = new MyYield(); //一个对象两个线程
        //礼让不一定成功
        new Thread(myYield, "a").start();
        new Thread(myYield, "b").start();
    }
}

class MyYield implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程开始执行");
        Thread.yield(); //礼让
        System.out.println(Thread.currentThread().getName() + "线程停止执行");
    }
}
/*
线程礼让
    礼让线程，让当前正在执行的线程暂停，但不阻塞
    将线程从运行状态转化为就绪状态
    让CPU重新调度，但礼让不一定成功，看CPU心情
 */