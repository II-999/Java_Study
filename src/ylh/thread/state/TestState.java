package ylh.thread.state;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 18:36
 */
//观察测试线程状态
public class TestState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("===================");
        });

        //观察状态
        Thread.State state = thread.getState();
        System.out.println(state); //NEW

        thread.start(); //启动 Run()方法
        state = thread.getState();
        System.out.println(state); //RUNNABLE

        //只要线程不终止
        while (state != Thread.State.TERMINATED) {
            Thread.sleep(1000);
            state = thread.getState(); //每隔1s,打印一次线程状态
            System.out.println(state);
        }

        //thread.start(); 死亡之后的线程不能再次启动，此语句会报错
    }

}
/*
观测线程状态
Thread.State 线程状态。

线程可以处于以下状态之一：
    NEW 尚未启动的线程处于此状态。
    RUNNABLE 在Java虚拟机中执行的线程处于此状态。
    BLOCKED被阻塞等待监视器锁定的线程处于此状态。
    WAITING 正在等待另一个线程执行特定动作的线程处于此状态。
    TIMED_WAITING 正在等待另一个线程执行动作达到指定等待时间的线程处于此状态。
    TERMINATED已退出的线程处于此状态。
    一个线程可以在给定时间点处于一个状态。
    这些状态是不反映任何操作系统线程状态的虚拟机状态。
 */