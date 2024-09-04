package com.springid.spring_di.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGretting() {
        return "Hello World - Setter GreetingService";
    }
}
