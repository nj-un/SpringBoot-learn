package com.gx.lock;

import com.gx.lock.interceptor.redis.CacheKeyGenerator;
import com.gx.lock.interceptor.redis.LockKeyGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LockApplication {

    @Bean
    public CacheKeyGenerator cacheKeyGenerator() {
        return new LockKeyGenerator();
    }

    public static void main(String[] args) {
        SpringApplication.run(LockApplication.class, args);
    }
}
