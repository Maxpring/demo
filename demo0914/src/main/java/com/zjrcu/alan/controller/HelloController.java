package com.zjrcu.alan.controller;

import com.zjrcu.alan.entities.User;
import com.zjrcu.alan.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
public class HelloController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/hello")
    public String hello() {
        return "hello,world";
    }


    @GetMapping("/UserId")
    @ResponseBody
    public List<User> ListUserById(int id) {
        return userService.getUserById(id);
    }

    @GetMapping("/AllUser")
    @ResponseBody
    public List<User> ListAllUser() {
        return userService.ListUser();
    }

    /*@RequestMapping("/")
    public ModelAndView index(){
        // 顾名思义 实体和数据 同时返回页面模板和数据
        ModelAndView mav = new ModelAndView("index");
        //List<Person> list = personService.getAll();
        List<User> list = userService.ListUser();
        //mav.addObject("list",list);
        mav.addObject("list",list);
        return mav;
    }*/

}
