package com.wzf.controller;

import com.wzf.entity.User;
import com.wzf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ModelAndView login(String loginName,String password){
        System.out.println(loginName+"---"+password);
        ModelAndView mv = new ModelAndView();
        if(userService.login(loginName,password) != null){
            mv.setViewName("UserShow");
            mv.addObject("currentUser",loginName);
        }else {
            mv.setViewName("Login");
            mv.addObject("mess","用户名或密码错误！");
        }
        return mv;
    }

    @RequestMapping("/add")
    public ModelAndView userAdd(User user){
        System.out.println(user.toString());
        userService.userAdd(user);
        return new ModelAndView("Login");
    }

    @RequestMapping("/a")
    public ModelAndView register(){
        return new ModelAndView("A");
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
