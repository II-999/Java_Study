package ylh.thread.lambda;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/24 16:00
 */
public class TestLambda1 {
    //3.静态内部类
    static class Like2 implements ILike {
        @Override
        public void lambda() {
            System.out.println("I like lambda2.");
        }
    }

    public static void main(String[] args) {
        ILike like = new Like1();
        like.lambda();

        like = new Like2();
        like.lambda();

        //4.局部内部类
        class Like3 implements ILike {
            @Override
            public void lambda() {
                System.out.println("I like lambda3.");
            }
        }

        like = new Like3();
        like.lambda();

        //5.匿名内部类
        like = new ILike() {
            @Override
            public void lambda() {
                System.out.println("I like lambda4.");
            }
        };
        like.lambda();

        //6.用lambda简化
        like = () -> {
            System.out.println("I like lambda5.");
        };
        like.lambda();
    }

}

//1.定义一个函数式接口
interface ILike {
    void lambda();
}

//2.实现外部类
class Like1 implements ILike {
    @Override
    public void lambda() {
        System.out.println("I like lambda1.");
    }
}

/*
Lamda表达式
    λ 希腊字母表中排序第十一位的字母，英语名称为 Lamda
    避免匿名内部类定义过多
    其实质属于函数式编程的概念
    去掉了一堆没有意义的代码,只留下核心逻辑
 */