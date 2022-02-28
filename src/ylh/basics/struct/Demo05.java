/**
 * @param null
 * @throws
 * @return
 * @author II
 * @date 2022/2/23 10:40
 */
package ylh.basics.struct;

public class Demo05 {
    public static void main(String[] args) {
        //打印三角形，灵活运用循环结构！
        for (int i = 1; i <= 8; i++) {
            for (int j = 8; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 4 * i - 3; j++) {//通过控制这个调整三角形！
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
