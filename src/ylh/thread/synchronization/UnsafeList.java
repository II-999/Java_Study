package ylh.thread.synchronization;

import java.util.ArrayList;
import java.util.List;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 19:58
 */
//三、线程不安全的集合
public class UnsafeList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(list.size());
    }
}
