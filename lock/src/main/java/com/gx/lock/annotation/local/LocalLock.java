package com.gx.lock.annotation.local;

import java.lang.annotation.*;

/**
 * 锁的注解
 *
 * @author: gaoxu
 * @date: 2018/9/18
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface LocalLock {

    /**
     * @author fly
     */
    String key() default "";

    /**
     * 过期时间( 由于用的 guava 暂时就忽略这属性吧 集成 redis 需要用到)
     *
     * @author fly
     */
    int expire() default 5;
}
