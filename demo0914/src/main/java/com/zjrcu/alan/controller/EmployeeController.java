package com.zjrcu.alan.controller;


import com.zjrcu.alan.entities.User;
import com.zjrcu.alan.service.impl.TbuserServiceImpl;
import com.zjrcu.alan.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private TbuserServiceImpl tbuserService;

//    @GetMapping("/emps")
//    public String list(Model model){
//
//        model.addAttribute("emps",userService.ListUser());
//
//        //thymeleaf默认就会拼串
//        // classpath:/templates/xxxx.html
//        return "emp/list";
//    }

    @GetMapping("/emps")
    public String list(Model model) {
        model.addAttribute("emps", tbuserService.getTbuser());
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddpage() {
        return "emp/add";
    }
}
