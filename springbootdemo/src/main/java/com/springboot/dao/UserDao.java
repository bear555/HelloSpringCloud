package com.springboot.dao;

import com.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    List<User> listUsers();
}
