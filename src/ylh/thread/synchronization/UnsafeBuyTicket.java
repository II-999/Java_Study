package ylh.thread.synchronization;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 18:56
 */
//一、不安全地买票
public class UnsafeBuyTicket {
    public static void main(String[] args) {

        BuyTicket station = new BuyTicket();

        new Thread(station, "小明").start();
        new Thread(station, "张三").start();
        new Thread(station, "黄牛").start();
    }
}

class BuyTicket implements Runnable {

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
    private void buy() throws InterruptedException {
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