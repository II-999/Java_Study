package ylh.annotation;

import java.lang.annotation.*;

/**
 * @author II
 * @version 1.0
 * @date 2022/2/25 10:38
 */
// 测试元注解
@MyAnnotation
public class Test02 {

    @MyAnnotation
    public void test() {

    }
}

// 定义一个注解
// Target 表示我们注解的可以用在哪些地方
@Target(value = {ElementType.METHOD, ElementType.TYPE})

// Retention 表示我们的注解在什么地方还有效
// runtime>class>sources
@Retention(value = RetentionPolicy.RUNTIME)

// Documented 表示是否将我们的注解声称在JAVAdoc中
@Documented
@interface MyAnnotation {

}
