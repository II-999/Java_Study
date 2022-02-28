package ylh.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/25 15:00
 */
//测试性能
public class Test10 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test01();
        test02();
        test03();
    }

    //普通方法调用
    public static void test01() {
        User user = new User();
        long start_time = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }
        long end_time = System.currentTimeMillis();
        System.out.println("普通方式执行10亿次需要：" + (end_time - start_time) + "ms");
    }

    //反射方式调用
    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();
        Method getName = c1.getMethod("getName", null);
        getName.invoke(user, null);
        long start_time = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }
        long end_time = System.currentTimeMillis();
        System.out.println("反射方式调用执行10亿次需要：" + (end_time - start_time) + "ms");
    }


    //反射方式调用，关闭安全监测
    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();
        Method getName = c1.getMethod("getName", null);
        getName.setAccessible(true);
        getName.invoke(user, null);
        long start_time = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }
        long end_time = System.currentTimeMillis();
        System.out.println("反射方式调用，关闭安全监测调用执行10亿次需要：" + (end_time - start_time) + "ms");
    }
}

