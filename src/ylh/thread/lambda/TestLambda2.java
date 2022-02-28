package ylh.thread.lambda;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 16:14
 */
/*
Lambda表达式 只有一行代码的情况下可以究极简化3
前提：函数式接口，且只能有一个方法
 */
public class TestLambda2 {
    public static void main(String[] args) {
        ILove love = null;

        //Lambda表达式，原生简化
        love = (int a) -> {
            System.out.println("I love you" + a);
        };

        //进阶简化1：去掉参数类型，多个参数也可以去掉，要去掉都去掉
        love = (a) -> {
            System.out.println("I love her" + a);
        };

        //进阶简化2：去掉括号，只能支持一个参数
        love = a -> {
            System.out.println("I love me" + a);
        };

        //进阶简化3：去掉大括号，只能单行函数体
        love = a -> System.out.println("I love me" + a);

        love.love(2); //测试
    }
}

interface ILove {
    void love(int a);
}
