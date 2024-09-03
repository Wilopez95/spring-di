package com.springid.spring_di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyCrontoller {

    public String sayHello() {
        System.out.println("Hello World!!");
        return "Hi Folks!";
    }
}
