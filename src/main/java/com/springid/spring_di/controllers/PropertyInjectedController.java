package com.springid.spring_di.controllers;

import com.springid.spring_di.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;
    public String getGreeting() {
        return greetingService.sayGretting();
    }
}
