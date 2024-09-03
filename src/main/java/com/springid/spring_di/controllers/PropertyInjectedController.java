package com.springid.spring_di.controllers;

import com.springid.spring_di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingService greetingService;
    public String getGreeting() {
        return greetingService.sayGretting();
    }
}
