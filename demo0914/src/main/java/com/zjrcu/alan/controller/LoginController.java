package com.zjrcu.alan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Map;


@Controller
public class LoginController {

    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model,
                        HttpSession session) {
        //具体的业务:
        if (!StringUtils.isEmpty(username) && "123456".equals(password)) {
            //登录成功,防止表单重复提交，可以重定向到主页
            session.setAttribute("loginUser", username);
            return "redirect:/main";
        } else {
            model.addAttribute("msg", "用户名或密码错误");
            return "index";
        }
    }
}
