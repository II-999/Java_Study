/**
 * @param null
 * @throws
 * @return
 * @author II
 * @date 2022/2/23 10:49
 */
package ylh.basics.array;

import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        System.out.println(a); //随机的一个Hash值
        //打印数组
        System.out.println(Arrays.toString(a)); //[1, 2, 3, 4, 5]

        Arrays.fill(a, 0);

        System.out.println(Arrays.toString(a));
    }
}
