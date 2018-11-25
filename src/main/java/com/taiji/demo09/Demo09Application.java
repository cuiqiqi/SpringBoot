package com.taiji.demo09;

import com.taiji.demo09.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Demo09Application {

    @Autowired
    private User user;


    public static void main(String[] args) {
        SpringApplication.run(Demo09Application.class,args);
    }

    @RequestMapping("/1")
    public String myUser(){
        return user.getName()+user.getAge()+user.getGender()+user.toString();
    }

}
