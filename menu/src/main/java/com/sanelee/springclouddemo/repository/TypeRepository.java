package com.sanelee.springclouddemo.repository;

import com.sanelee.springclouddemo.entity.Type;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@Mapper
public interface TypeRepository {
    public Type findById(long id);
    public List<Type>  findAll();
}
