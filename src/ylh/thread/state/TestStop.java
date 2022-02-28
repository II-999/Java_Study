package ylh.thread.state;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 16:24
 */
/*
测试stop
 */

public class TestStop implements Runnable {
    //1.设置一个标识位
    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag) {
            System.out.println("run..Thread--" + i++);
        }
    }

    //2.设置公开的方法，转换标识位，让线程停止
    public void stop() {
        this.flag = false;
    }

    public static void main(String[] args) {
        TestStop thread = new TestStop();
        new Thread(thread).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("main--" + i);
            //3.调用方法停止线程
            if (i == 900) {
                thread.stop();
                System.out.println("线程该停止了。。");
            }
        }
    }
}
