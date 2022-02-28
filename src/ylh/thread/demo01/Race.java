package ylh.thread.demo01;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 15:29
 */
//龟兔赛跑
public class Race implements Runnable {
    //胜利者
    private static String winner;

    @Override
    public void run() {
        for (int i = 1; i <= 101; i++) {

            boolean flag = gameOver(i); //判断比赛是否结束
            if (flag) break;

            System.out.println(Thread.currentThread().getName() + "-->跑了" + i + "步");

            //模拟兔子休息
            if (Thread.currentThread().getName().equals("兔子") && i % 10 == 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //判断是否完成比赛
    private boolean gameOver(int steps) {
        if (winner != null) { //已经存在胜利者
            return true;
        }
        if (steps == 101) {
            winner = Thread.currentThread().getName();
            System.out.println("winner is" + winner);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race, "兔子").start();
        new Thread(race, "乌龟").start();
    }
}