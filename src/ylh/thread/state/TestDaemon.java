package ylh.thread.state;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 18:45
 */
//测试守护线程 daemon
public class TestDaemon {

    public static void main(String[] args) {
        God god = new God();
        You you = new You();

        //上帝是守护线程，用户线程结束自己也结束
        Thread thread = new Thread(god);
        thread.setDaemon(true); //设置为守护线程 默认是false(表示用户线程)

        thread.start(); //守护线程启动

        new Thread(you).start(); //用户线程启动
    }

}

class God implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("上帝保佑着你");
        }
    }
}

class You implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("你度过了开心的第"+i+"天");
        }
        System.out.println("-==goodbye,world!==-");
    }
}
/*
守护线程
    线程分为用户线程和守护线程(daemon)
    虚拟机必须确保用户线程执行完毕
    虚拟机不用等待守护线程执行完毕
    如，后台记录操作日志，监控内存，垃圾回收等待…
 */
