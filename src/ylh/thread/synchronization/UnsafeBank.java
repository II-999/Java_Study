package ylh.thread.synchronization;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 19:40
 */
//二、不安全地取钱
public class UnsafeBank {
    public static void main(String[] args) {
        // 账户
        Account2 account = new Account2(1000, "结婚基金");

        Drawing2 you = new Drawing2(account, 50, "你");
        Drawing2 girlFriend = new Drawing2(account, 100, "girlFriend");

        you.start();
        girlFriend.start();
    }
}

// 账户
class Account {
    int money; // 余额
    String name; // 卡名

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

// 银行：模拟取款
class Drawing extends Thread {
    Account account; // 账户
    int drawingMoney; // 取了多少钱
    int nowMoney; // 现在手里有多少钱

    public Drawing(Account account, int drawingMoney, String name) {
        super(name);
        this.drawingMoney = drawingMoney;
        this.account = account;
    }

    @Override
    public void run() {
        // 判断有没有钱
        if (account.money - drawingMoney < 0) {
            System.out.println(Thread.currentThread().getName() + "的钱不够，取不了");
            return;
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 卡内余额 = 余额 - 你取的钱
        account.money = account.money - drawingMoney;

        // 你手里的钱
        nowMoney += drawingMoney;

        System.out.println(account.name + "的余额为" + account.money);
        System.out.println(this.getName() + "手里的钱：" + nowMoney);
    }
}