package com.gx.mybatis.page.mapper;

import com.gx.mybatis.page.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    int countByUsername(String username);
}
