package com.example.jwt.securityjwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/users")
    @ResponseBody
    public String getUsers(){
        return "users\":[{\"name\":\"Maria\", \"country\":\"Brazil\"}," +
                "{\"name\":\"Adam\",\"country\":\"USA\"}]}";
    }
}
