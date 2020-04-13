package com.practice.springcache.service;

import com.practice.springcache.model.User;
import org.springframework.stereotype.Service;

/**
 * @author gaoayang
 * create by gaoyang on 2020/4/13
 */
public interface UserService {

    User getById(int id);
}
