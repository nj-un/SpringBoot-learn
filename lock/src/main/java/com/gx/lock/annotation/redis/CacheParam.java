package com.gx.lock.annotation.redis;

import java.lang.annotation.*;

/**
 * 锁的参数
 *
 * @author: gaoxu
 * @date: 2018/9/18
 */
@Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface CacheParam {

    /**
     * 字段名称
     *
     * @return String
     */
    String name() default "";
}
