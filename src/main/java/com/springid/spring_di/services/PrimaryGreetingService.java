package com.springid.spring_di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGretting() {
        return "Hello world - From the primary bean";
    }
}
