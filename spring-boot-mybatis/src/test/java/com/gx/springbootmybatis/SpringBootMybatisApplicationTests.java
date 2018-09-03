package com.gx.springbootmybatis;

import com.gx.springbootmybatis.entity.User;
import com.gx.springbootmybatis.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(SpringBootMybatisApplicationTests.class);

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1() throws Exception {
        //final int row1 = userMapper.insert(new User("u11", "p11"));
        //log.info("[添加结果] - [{}]", row1);
//        final int row2 = userMapper.insert(new User("u2", "p2"));
//        log.info("[添加结果] - [{}]", row2);
//        final int row3 = userMapper.insert(new User("u1", "p3"));
//        log.info("[添加结果] - [{}]", row3);
//        final List<User> u1 = userMapper.findByUsername("u1");
//        log.info("[根据用户名查询] - [{}]", u1);

        final int d1 = userMapper.delete(new User("user1", "pass1"));
        log.info("[删除结果] - [{}]", d1);
    }

}
