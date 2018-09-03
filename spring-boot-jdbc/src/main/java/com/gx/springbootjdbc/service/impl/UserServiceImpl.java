package com.gx.springbootjdbc.service.impl;

import com.gx.springbootjdbc.dao.UserDAO;
import com.gx.springbootjdbc.entity.User;
import com.gx.springbootjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户表(TUser)表服务实现类
 *
 * @author makejava
 * @since 2018-08-14 13:19:49
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDao;

    @Autowired
    public UserServiceImpl(UserDAO userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }

    @Override
    public User getUser(Long id) {
        return userDao.getUser(id);
    }

    @Override
    public int delUser(Long id) {
        return userDao.delUser(id);
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public int editUser(Long id, User user) {
        return userDao.editUser(id, user);
    }
}