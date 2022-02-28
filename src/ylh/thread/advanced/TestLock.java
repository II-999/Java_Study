package ylh.thread.advanced;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 20:41
 */
public class TestLock {
    public static void main(String[] args) {
        TestLock2 testLock2 = new TestLock2();

        new Thread(testLock2).start();
        new Thread(testLock2).start();
        new Thread(testLock2).start();
    }
}

class TestLock2 implements Runnable {
    int ticketNums = 10;

    // 定义lock锁
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock(); // 加锁
            try {
                if (ticketNums > 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(ticketNums--);
                } else {
                    break;
                }
            } finally {
                // 解锁
                lock.unlock();
            }
        }
    }
}
/*
Lock(锁)
    从JDK5.0开始，Java提供了更强大的同步线程机制——通过显式定义同步锁对象来实现同步，同步锁使用Lock对象充当。

    Lock接口是控制躲个线程对共享资源进行访问的工具。
    锁提供了对共享资源的独占访问，每次只能有一个线程对Lock加锁，线程开始访问资源前必须先获得Lock对象。

    ReentrantLock(可重入锁)类实现了Lock，它拥有与synchronized相同的并发性和内存语义，
    在实现线程安全的控制中，比较常用的是ReentrantLock，可以显式加锁，释放锁。
 */