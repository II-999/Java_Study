package ylh.thread.state;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 16:40
 */
/*
测试join方法，线程插队，强制执行，阻塞其他线程，尽量少用
 */
public class TestJoin implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println("线程vip来了" + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start(); //启动我们的线程

        //主线程
        for (int i = 0; i <= 500; i++) {
            if (i == 200) {
                thread.join(); //插队，等线程执行完
            }
            System.out.println("main" + i);
        }
    }
}
/*
线程插队
    Join合并线程，待线程执行完成后，在执行其他线程，其他线程堵塞
 */