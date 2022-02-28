package ylh.thread.synchronization;

import java.util.ArrayList;
import java.util.List;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 19:58
 */
public class SafeList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                synchronized (list){
                    list.add(Thread.currentThread().getName());
                }
            }).start();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(list.size());
    }
}
