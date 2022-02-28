package ylh.thread.synchronization;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 20:06
 */
public class SafeBuyTicket {
    public static void main(String[] args) {

        BuyTicket2 station = new BuyTicket2();

        new Thread(station, "小明").start();
        new Thread(station, "张三").start();
        new Thread(station, "黄牛").start();
    }
}

class BuyTicket2 implements Runnable {

    // 票
    private int ticketNums = 10;
    boolean flag = true; // 外部停止方式

    @Override
    public void run() {
        // 买票
        while (flag) {
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //同步方法：synchronized，锁的是this
    private synchronized void buy() throws InterruptedException {
        //判断是否有票
        if (ticketNums <= 0) {
            this.flag = false;
            return;
        }
        Thread.sleep(500); //模拟延时
        //买票
        System.out.println(Thread.currentThread().getName() + "拿到" + ticketNums--);
    }
}
/*
线程同步
    并发：同一对象被多个线程同时操作（抢票）
    线程同步是一个等待机制，多个需要同时访问次对象的线程进入这个对象的等待池形成队列，等待前一个线程使用完毕，下一个线程才能使用。
弊端
    方法里需要修改的内容才需要锁，只读可以不用锁，锁太多会浪费资源。
 */