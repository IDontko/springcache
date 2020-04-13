package com.practice.springcache.controller;

import com.practice.springcache.model.User;
import com.practice.springcache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author gaoayang
 * create by gaoyang on 2020/4/13
 */
@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getById(@PathVariable int id){
        return userService.getById(id);
    }
}
