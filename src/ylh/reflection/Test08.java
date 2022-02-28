package ylh.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/25 12:04
 */
// 活得类的信息
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("ylh.reflection.User");

        // 获得类的名字
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());

        // 获得类的属性
        System.out.println("============================");
        Field[] fields = c1.getFields(); // 只能找到public属性

        fields = c1.getDeclaredFields(); // 找到全部的属性
        for (Field field : fields) {
            System.out.println(field);
        }

        // 获得指定属性的值
        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        // 获得类的方法
        System.out.println("============================");
        Method[] methods = c1.getMethods(); // 获得本类及其父类的所有public方法
        for (Method method : methods) {
            System.out.println("正常的" + method);
        }

        methods = c1.getDeclaredMethods(); // 获得本类的所有方法
        for (Method method : methods) {
            System.out.println("Declared的" + method);
        }

        // 获取指定的方法
        // 重载
        Method getName = c1.getMethod("getName", null);
        System.out.println(getName);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(setName);

        // 获取指定的构造器
        System.out.println("=================================");
        Constructor[] constructors = c1.getConstructors();//获取public
        for (Constructor constructor : constructors) {
            System.out.println("c1.getConstructors():" + constructor);
        }

        Constructor[] constructors1 = c1.getDeclaredConstructors();//获取所有的构造器
        for (Constructor constructor : constructors1) {
            System.out.println("c1.getDeclaredConstructors():" + constructor);
        }

        // 获取指定的构造器
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println("获取指定的构造器" + declaredConstructor);
    }
}
