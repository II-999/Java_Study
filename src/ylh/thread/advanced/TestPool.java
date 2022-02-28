package ylh.thread.advanced;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 21:11
 */
//线程池
public class TestPool {
    public static void main(String[] args) {
        //1.创建服务，创建线程池
        //newFixedThreadPool 参数：线程池大小
        ExecutorService service = Executors.newFixedThreadPool(10);

        //执行
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        //2.关闭连接
        service.shutdown();
    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

/*
线程池
    背景：经常销毁、使用量特别大的资源，比如并发情况下的线程，对性能影响很大。
    思路：提前创建好多个线程，放入线程池中，使用时直接获取，使用完放回池中。可以避免频繁创建销毁、实现重复利用。类似生活中的公共交通工具。
好处：
    提高响应速度（减少了创建新线程的时间）
    降低资源消耗（重复利用线程池中线程，不用每次都创建）
    便于线程管理
        corePoolSize (核心池大小)
        maximumPoolSize (最大线程数)
        keepAliveTime (当线程没有任务，保持多长时间终止)
 */