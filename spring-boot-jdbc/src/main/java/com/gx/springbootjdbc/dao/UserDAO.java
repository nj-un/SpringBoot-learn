package com.gx.springbootjdbc.dao;

import com.gx.springbootjdbc.entity.User;

import java.util.List;

/**
 * @author: gaoxu
 * @date: 2018/9/3
 */
public interface UserDAO {

    public List<User> getUserList();

    public User getUser(Long id);

    public int delUser(Long id);

    public int addUser(User user);

    public int editUser(Long id, User user);
}
