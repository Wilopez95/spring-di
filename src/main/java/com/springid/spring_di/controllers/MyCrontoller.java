package com.springid.spring_di.controllers;

import com.springid.spring_di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyCrontoller {

    private final GreetingService greetingService;

    public MyCrontoller(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGretting();
    }
}
