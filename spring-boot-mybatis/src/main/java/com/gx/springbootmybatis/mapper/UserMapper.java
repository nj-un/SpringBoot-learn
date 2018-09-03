package com.gx.springbootmybatis.mapper;

import com.gx.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    int insert(User test);

    void update(User test);

    int delete(User test);
}
