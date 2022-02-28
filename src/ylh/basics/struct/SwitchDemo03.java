/**
 * @param null
 * @throws
 * @return
 * @author II
 * @date 2022/2/23 10:42
 */
package ylh.basics.struct;

public class SwitchDemo03 {
    public static void main(String[] args) {
        String name = "应灵昊";
        //JDK7新特性，switch表达式支持字符串
        //字符串本质还是数字

        // 反编译 java---》class（字节码文件）----》反编译（IDEA）---》Java文件

        // IDEA项目的out目录里面的就是idea反编译class文件所得！
        /*
         String name = "应灵昊";
        byte var3 = -1;
        switch(name.hashCode()) {
        case 20953866:
            if (name.equals("邱源")) {
                var3 = 1;
            }
            break;
        case 24137738:
            if (name.equals("应灵昊")) {
                var3 = 0;
            }
        }

        switch(var3) {
        case 0:
            System.out.println("应灵昊");
            break;
        case 1:
            System.out.println("邱源");
            break;
        default:
            System.out.println("查无此人！");
        }
         */
        switch (name) {
            case "应灵昊":
                System.out.println("应灵昊");
                break;
            case "邱源":
                System.out.println("邱源");
                break;
            default:
                System.out.println("查无此人！");
        }
    }
}
