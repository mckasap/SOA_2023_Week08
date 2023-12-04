package com.example.MySB02.demo.controller;

import com.example.MySB02.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/")
    public String Hello(){
        return "Hello World!";
    }

@RequestMapping(value = "/user",method= RequestMethod.POST)
    public User helloUser(){
        User usr= new User("12345","MCem","Kasapbaşı","mckasapbasi","mckasapbasi@ticaret.edu.tr");

        return usr;
    }
}
