package ylh.basics.exception.demo01;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 9:38
 */
public class Demo01 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try { //try监控区域
            System.out.println(a / b);
        } catch (ArithmeticException e) { //catch 捕获异常
            System.out.println("程序出现异常，变量b不能为0");
        } catch (Exception e) {
            e.printStackTrace();
        } finally { //一定会执行，处理善后工作，如关闭资源
            System.out.println("finally");
        }

        if (b == 0) { //抛出异常一般在方法中使用
            throw new ArithmeticException(); //主动抛出异常
        }
    }
//Ctrl+Alt+T 快捷键插入 try-catch
}
/*
异常
    软件程序在运行过程中，经常可能遇到异常问题，异常英文(Exception)，意思是例外，这些例外情况需要我们写程序做出合理的处理，而不至于让程序崩溃。
    异常指程序运行中出现的不期而至的各种状况：文件找不到，网络连接错误，非法参数等。
    异常发生在程序运行期间，它影响了正常的执行流程
 */
/*
简单分类
    检查型异常：最具代表性异常是用户错误或问题引起的异常，这是程序员无法预见的。例如用户要打开一个不存在的文件时引发的异常，这些异常在编译时不能被简单地忽略。
    运行时异常：是可能被程序员避免的异常，与检查性异常相反，运行时异常可以在编译时忽略。
    错误Error：错误不是异常，而是脱离程序员控制的问题。错误在代码经常被忽略。例如当栈溢出，一个异常就发生了，它们在编译也检查不到。
 */
/*
异常处理机制
    抛出异常
    捕获异常
    异常处理关键字：try、catch、finally、throw、throws
 */