package com.gx.lock.controller;

import com.gx.lock.annotation.local.LocalLock;
import com.gx.lock.annotation.redis.CacheLock;
import com.gx.lock.annotation.redis.CacheParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: gaoxu
 * @date: 2018/9/18
 */
@RestController
@RequestMapping("/books")
public class LockController {

//    @LocalLock(key = "book:arg[0]")
//    @GetMapping
//    public String query(@RequestParam String token) {
//        return "success - " + token;
//    }

    @CacheLock(prefix = "books")
    @GetMapping
    public String get(@CacheParam(name = "token") @RequestParam String token) {
        return "success - " + token;
    }
}
