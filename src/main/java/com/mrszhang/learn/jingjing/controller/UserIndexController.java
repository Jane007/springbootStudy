package com.mrszhang.learn.jingjing.controller;

import com.mrszhang.learn.jingjing.model.User;
import com.mrszhang.learn.jingjing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userIndex")
@EnableAutoConfiguration
public class UserIndexController {
    @Autowired
    private UserService userService;
    @RequestMapping("/list")
    @ResponseBody
    public List<User> findAllUser(){

        return userService.findAll();
    }
}
