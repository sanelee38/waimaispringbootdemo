package com.sanelee.springclouddemo.repository;

import com.sanelee.springclouddemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
    public User login(String username, String password);
}
