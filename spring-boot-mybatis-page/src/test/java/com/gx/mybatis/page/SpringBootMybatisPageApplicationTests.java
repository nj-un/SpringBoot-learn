package com.gx.mybatis.page;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gx.mybatis.page.common.PageBean;
import com.gx.mybatis.page.entity.User;
import com.gx.mybatis.page.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisPageApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(SpringBootMybatisPageApplicationTests.class);

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1() throws Exception {
//        final User user1 = new User("u1", "p1");
//        final User user2 = new User("u1", "p2");
//        final User user3 = new User("u3", "p3");
//        userMapper.insertSelective(user1);
//        log.info("[user1回写主键] - [{}]", user1.getId());
//        userMapper.insertSelective(user2);
//        log.info("[user2回写主键] - [{}]", user2.getId());
//        userMapper.insertSelective(user3);
//        log.info("[user3回写主键] - [{}]", user3.getId());
//        final int count = userMapper.countByUsername("u1");
//        log.info("[调用自己写的SQL] - [{}]", count);
//
//        // TODO 模拟分页
//        userMapper.insertSelective(new User("u1", "p1"));
//        userMapper.insertSelective(new User("u1", "p1"));
//        userMapper.insertSelective(new User("u1", "p1"));
//        userMapper.insertSelective(new User("u1", "p1"));
//        userMapper.insertSelective(new User("u1", "p1"));
//        userMapper.insertSelective(new User("u1", "p1"));
//        userMapper.insertSelective(new User("u1", "p1"));
//        userMapper.insertSelective(new User("u1", "p1"));
//        userMapper.insertSelective(new User("u1", "p1"));
//        userMapper.insertSelective(new User("u1", "p1"));
//        // TODO 分页 + 排序 this.userMapper.selectAll() 这一句就是我们需要写的查询，有了这两款插件无缝切换各种数据库
//        final PageInfo<Object> pageInfo = PageHelper.startPage(1, 10).setOrderBy("id desc").doSelectPageInfo(() -> this.userMapper.selectAll());
//        log.info("[lambda写法] - [分页信息] - [{}]", pageInfo.toString());
//
//        PageHelper.startPage(1, 10).setOrderBy("id desc");
//        final PageInfo<User> userPageInfo = new PageInfo<>(this.userMapper.selectAll());
//        log.info("[普通写法] - [{}]", userPageInfo);

        PageHelper.startPage(1, 10);

        List<User> users = this.userMapper.selectAll();

        log.info("分页信息总条数" + new PageBean<User>(users).getTotal());

    }

}
