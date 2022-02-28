/**
 * @param null
 * @throws
 * @return
 * @author II
 * @date 2022/2/23 10:47
 */
package ylh.basics.method;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入操作数和计算方式，均以空格分开：");
        while (scanner.hasNextDouble()) {
            double a = scanner.nextDouble();
            String type = scanner.next();
            double b = scanner.nextDouble();
            switch (type) {
                case "+":
                    add(a, b);
                    break;
                case "-":
                    minus(a, b);
                    break;
                case "*":
                    multiply(a, b);
                    break;
                case "/":
                    except(a, b);
                    break;
            }
            System.out.println("输入任意字母退出");
            System.out.println("请输入操作数和计算方式，均以空格分开：");
        }
        scanner.close();
    }

    public static void add(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    public static void minus(double num1, double num2) {
        System.out.println(num1 - num2);
    }

    public static void multiply(double num1, double num2) {
        System.out.println(num1 * num2);
    }

    public static void except(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("分母不能为0");
        } else {
            System.out.println(num1 / num2);
        }
    }
}
