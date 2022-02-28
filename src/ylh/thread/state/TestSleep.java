package ylh.thread.state;

import ylh.thread.demo01.TestThread4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 16:31
 */
public class TestSleep {
    public static void main(String[] args) {
        //1.模拟倒计时
        try {
            tenDown(); //10s倒计时
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //2.打印当前系统时间
        Date startTime = new Date(System.currentTimeMillis()); //获取当前时间

        while (true) { //模拟时钟
            try {
                Thread.sleep(1000); //每隔1s
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));
                startTime = new Date(System.currentTimeMillis()); //更新当前时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void tenDown() throws InterruptedException {
        int num = 10;
        while (true) {
            Thread.sleep(1000); //每隔1s
            System.out.println(num--);
            if (num <= 0) break;
        }
    }
}
/*
线程休眠
    sleep(时间)指定当前线程阻塞的毫秒数；
    sleep时间到达后线程就进入就绪状态；
    sleep存在异常InterruptedException；
    sleep可以模拟网络延时，倒计时等。（故意设置延时收优化钱💴，不道德，比如某盘）
    每一个对象都有一个锁🔒，sleep不会释放锁。
 */