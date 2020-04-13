package com.practice.springcache.service.impl;

import com.practice.springcache.mapper.UserMapper;
import com.practice.springcache.model.User;
import com.practice.springcache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author gaoayang
 * create by gaoyang on 2020/4/13
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Cacheable(cacheNames = "user")
    @Override
    public User getById(int id) {
        return userMapper.getById(id);
    }
}
