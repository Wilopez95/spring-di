package com.springid.spring_di.controllers;

import com.springid.spring_di.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        String greeting = controller.getGreeting();
        System.out.println(greeting);
    }

    @Test
    void testGetGreeting() {
    }
}