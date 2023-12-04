package com.example.MySB02.demo.controller;

import com.example.MySB02.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    //Parametre OKUMA
 @GetMapping("/user/{id}/{id2}")
 public String getMapping(@PathVariable(name="id")  String test,
                          @PathVariable("id2") String id2){
        return "My TEST RESULT :"+test +" : " +id2;
 }
// Query String okuma
@GetMapping("/sorgu")
 public String getQS(@RequestParam(name="name") String name,
                     @RequestParam(name="id") String id,
                     @RequestParam(name="email", required = false,defaultValue = "") String email){

        return "Name :" +name + "<br>" + "id :" +id + "<br>" + "Email :" +email + "<br>";





}

}
