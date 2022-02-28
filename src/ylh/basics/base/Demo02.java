/**
 * @param null
 * @throws
 * @return
 * @author II
 * @date 2022/2/23 10:38
 */
package ylh.basics.base;

public class Demo02 {
    public static void main(String[] args) {
        // 整数扩展
        int a = 10; //十进制
        int b = 010; //八进制
        int c = 0x11; //十六进制
        System.out.println(a);//10
        System.out.println(b);//8  8^1+8^0
        System.out.println(c);//17  16^1+16^0

        System.out.println("=====================================================");

        //字符扩展   unicode编码
        char z = '应', t = '灵', y = '昊';
        System.out.println((int) z);
        System.out.println((int) t);
        System.out.println((int) y);

        char x = '\u0061';
        System.out.println(x); // a

        System.out.println("======================================================");
        // 转义字符
        System.out.println("hello\tworld");// 制表符
        System.out.println("hello\nworld");// 换行符

        System.out.println("=================================================");

        String sa = new String("ylhfmj");
        String sb = new String("ylhfmj");

        String sc = "ylhfmj";
        String sd = "ylhfmj";

        System.out.println(sa == sb);//false  new出来的地址不同，引用型类型！
        System.out.println(sc == sd);//true   两个内容相同，并且同时指向同一个地址，所以相同！
    }
}
