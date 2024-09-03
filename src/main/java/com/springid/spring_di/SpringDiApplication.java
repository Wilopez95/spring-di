package com.springid.spring_di;

import com.springid.spring_di.controllers.MyCrontoller;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);
		MyCrontoller myCrontoller = ctx.getBean(MyCrontoller.class);
		String greeting = myCrontoller.sayHello();
		System.out.println(greeting);
	}

}
