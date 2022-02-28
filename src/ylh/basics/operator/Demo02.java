/**
 * @param null
 * @throws
 * @return
 * @author II
 * @date 2022/2/23 10:45
 */
package ylh.basics.operator;

public class Demo02 {
    public static void main(String[] args) {
        int x = 1;
        int a = ++x; //先执行x+1，再把值赋给a
        int b = x++;// 先把x的值赋给b，再执行x+1
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
    }
}
