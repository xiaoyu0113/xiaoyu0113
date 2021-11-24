package com.yjw.blog.dao;

import com.yjw.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yu on 2021/11/24
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username,String password);


}
