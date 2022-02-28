package ylh.reflection;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/25 11:51
 */
public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取系统类加载器的父类加载器-->扩展加载器
        ClassLoader parent1 = systemClassLoader.getParent();
        System.out.println(parent1);

        //获取扩展类加载器的父类加载器-->根加载器（c/c++）
        ClassLoader parent2 = parent1.getParent();
        System.out.println(parent2);

        //测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("ylh.reflection.Test07").getClassLoader();
        System.out.println(classLoader);

        //测试JDK内置类是哪个加载器加载的
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);

        //如何获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));

        //双亲委派机制

        /*
        F:\Java\project\exercise\out\production\project;
        F:\Java\project\exercise\src\ylh\lib\commons-io-2.11.0.jar
         */
    }
}
