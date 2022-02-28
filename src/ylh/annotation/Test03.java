package ylh.annotation;

import java.lang.annotation.*;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/25 10:45
 */
// 自定义注解
@MyAnnotation2
public class Test03 {
    // 注解可以显式赋值，如果没有默认值，就必须给注解赋值
    @MyAnnotation2(name = "应灵昊")
    public void test1() {
    }

    @MyAnnotation3("应灵昊")
    public void test2() {
    }
}

@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {
    // 注解的参数：参数类型+参数名()
    String name() default "";

    int age() default 1;

    int id() default -1;// 如果默认值为-1，表示不存在

    String[] schools() default {"浙工大", "计算机科学与技术"};
}

@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation3 {
    String value();
}