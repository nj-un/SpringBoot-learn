package com.gx.springbootjdbc.controller;

import com.gx.springbootjdbc.entity.User;
import com.gx.springbootjdbc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: gaoxu
 * @date: 2018/8/31
 */
@RestController
@RequestMapping
public class JdbcController {

    private static final Logger log = LoggerFactory.getLogger(JdbcController.class);

    @Autowired
    public UserService userService;

    @GetMapping
    public List<User> queryUsers() {
        // 查询所有用户
        return userService.getUserList();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @DeleteMapping("/{id}")
    public int delUser(@PathVariable Long id) {
        return userService.delUser(id);
    }

    @PostMapping
    public int addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping("/{id}")
    public int editUser(@PathVariable Long id, @RequestBody User user) {
        return userService.editUser(id, user);
    }
}
