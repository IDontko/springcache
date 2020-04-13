package com.practice.springcache.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author gaoayang
 * create by gaoyang on 2020/4/13
 */
@Data
public class User implements Serializable {

    private int id;

    private String name;

    private String age;

    private int gender; //0代表男，1代表女

}
