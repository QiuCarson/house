package com.imooc.house.web.controller;

import com.imooc.house.biz.service.UserService;
import com.imooc.house.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getuser")
    public List<User> getUser() {
        return userService.getUsers();
    }

    @GetMapping("/gethello")
    public String hello(ModelMap modelMap) {
        List<User> users = userService.getUsers();
        User one = users.get(0);
        //System.out.println(one);
        modelMap.put("user", one);
        return "hello";
    }

    @GetMapping("index")
    public String index(ModelMap modelMap) throws IllegalAccessException {

        return "homepage/index";
    }
}
