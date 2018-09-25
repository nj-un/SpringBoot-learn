package com.gx.lock.interceptor.redis;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * key生成器
 *
 * @author: gaoxu
 * @date: 2018/9/18
 */
public interface CacheKeyGenerator {
    /**
     * 获取AOP参数,生成指定缓存Key
     *
     * @param pjp PJP
     * @return 缓存KEY
     */
    String getLockKey(ProceedingJoinPoint pjp);
}

