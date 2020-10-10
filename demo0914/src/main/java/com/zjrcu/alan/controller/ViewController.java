package com.zjrcu.alan.controller;

import com.zjrcu.alan.entities.User;
import com.zjrcu.alan.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ViewController {
    @Autowired
    private UserServiceImpl userService;


    // 设置访问路由值为路径
    @RequestMapping("/")
    public ModelAndView index() {
        // 顾名思义 实体和数据 同时返回页面模板和数据
        ModelAndView mav = new ModelAndView("index");
        //List<Person> list = personService.getAll();
        List<User> list = userService.ListUser();
        //mav.addObject("list",list);
        mav.addObject("list", list);
        return mav;
    }

    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("layui");
    }

    @RequestMapping("/table")
    public ModelAndView table() {
        return new ModelAndView("layui1");
    }

    @RequestMapping("/table02")
    public ModelAndView table02() {
        return new ModelAndView("layui02");
    }

    @RequestMapping("/form01")
    public ModelAndView layuiForm() {
        return new ModelAndView("layui-form01");
    }
    //高级查询
//    @RequestMapping("/query")
//    @ResponseBody
//    public Layui query(DepartmentQuery query){
//        Page pageByQuery = departmentService.findPageByQuery(query);
//        Layui data = Layui.data(pageByQuery.getTotal(), pageByQuery,"",0);
//        return data;
//    }
}
