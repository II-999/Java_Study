/**
 * @param null
 * @throws
 * @return
 * @author II
 * @date 2022/2/23 10:44
 */
package ylh.basics.scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //从键盘接收数据
        int i = 0;
        double d = 0.0;

        System.out.println("请输入整数：");
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            System.out.println("输入的整数为：" + i);
        } else {
            System.out.println("输入的不是整数！");
        }
        System.out.println("请输入小数：");
        if (scanner.hasNextDouble()) {
            d = scanner.nextDouble();
            System.out.println("输入的小数为：" + d);
        } else {
            System.out.println("输入的不是小数！");
        }

        scanner.close();
    }
}
