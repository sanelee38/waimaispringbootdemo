package com.sanelee.springclouddemo.repository;

import com.sanelee.springclouddemo.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminRepository {
    public Admin login(String username, String password);

}
