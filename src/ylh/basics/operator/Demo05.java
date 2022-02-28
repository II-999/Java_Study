/**
 * @param null
 * @throws
 * @return
 * @author II
 * @date 2022/2/23 10:45
 */
package ylh.basics.operator;

public class Demo05 {
    public static void main(String[] args) {
        //字符串连接的细节
        int a = 10;
        int b = 20;

        // 总结：从第一个字符串类型开始后的都用拼接
        System.out.println("" + a + b);// 1020  运算前有String类型,默认转换后面的也为String，然后通过+进行字符串拼接
        System.out.println(a + b + " " + 2);// 30 2  字符串在a+b之后，先进行运算，字符串类型后面的再按照上述方式进行拼接
    }
}
