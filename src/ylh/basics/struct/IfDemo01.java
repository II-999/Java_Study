/**
 * @param null
 * @throws
 * @return
 * @author II
 * @date 2022/2/23 10:42
 */
package ylh.basics.struct;

public class IfDemo01 {
    public static void main(String[] args) {
        int x = 10;
        if (x > 1) { //执行到这里就结束if-else，就算后面语句都是对的也不执行！！
            System.out.println("A");
        } else if (x > 2) {
            System.out.println("B");
        } else if (x > 4) {
            System.out.println("C");
        } else {
            System.out.println("Other");
        }
    }
}
