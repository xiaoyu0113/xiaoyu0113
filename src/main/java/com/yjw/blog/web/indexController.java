package com.yjw.blog.web;

import com.yjw.blog.NotFindException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by yu on 2021/11/23
*/
@Controller
public class indexController {

    @GetMapping("/")
    public String index(){
//        int i=9/0;
//        String blog = null;
//        if (blog == null){
//            throw new NotFindException("博客不存在");
//        }
        return "index";

    }

    @GetMapping("/blog")
    public String blog(){

        return "blog";
    }

}
