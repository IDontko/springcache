package com.practice.springcache.mapper;

import com.practice.springcache.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author gaoayang
 * create by gaoyang on 2020/4/13
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User getById(int id);
}
