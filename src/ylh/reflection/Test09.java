package ylh.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/25 12:18
 */
// 通过反射动态地创建对象
public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        // 获得Class对象
        Class c1 = Class.forName("ylh.reflection.User");

        // 构造一个对象
        User user1 = (User) c1.newInstance(); // 本质是调用了类的无参构造器
        System.out.println(user1);

        // 通过构造器创建对象
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user2 = (User) constructor.newInstance("ylh", 001, 9);
        System.out.println(user2);

        // 通过反射调用普通方法
        User user3 = (User) c1.newInstance();
        // 通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);

        // invoke： 激活的意思
        // （对象，“方法的值”）
        setName.invoke(user3,"ylh");
        System.out.println(user3.getName());

        // 通过反射操作属性
        System.out.println("=======================================");
        User user4 = (User) c1.newInstance();
        Field name = c1.getDeclaredField("name");

        // 不能直接操作私有属性，我们需要关闭程序的安全监测
        // 通过：name.setAccessible(true);
        name.setAccessible(true);
        name.set(user4,"YLH");
        System.out.println(user4.getName());
    }
}