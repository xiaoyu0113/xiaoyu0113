package com.yjw.blog.service;


import com.yjw.blog.po.User;

/**
 * Created by yu on 2021/11/24
 */
public interface UserService {

    User checkUser(String username,String password);
}
