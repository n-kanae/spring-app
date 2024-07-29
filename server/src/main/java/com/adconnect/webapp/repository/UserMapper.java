package com.adconnect.webapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.adconnect.webapp.entity.User;

@Mapper
public interface UserMapper {

    List<User> selectAll();

    User selectById(@Param("id") Integer id);

    void insert(User user);

    void update(User user);

    void delete(@Param("id") Integer id);

}
