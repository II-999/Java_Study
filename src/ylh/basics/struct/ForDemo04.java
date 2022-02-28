/**
 * @param null
 * @throws
 * @return
 * @author II
 * @date 2022/2/23 10:40
 */
package ylh.basics.struct;

public class ForDemo04 {
    public static void main(String[] args) {
        //99乘法口诀表
        System.out.println("----------------------------------------");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "X" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");

    }
}
