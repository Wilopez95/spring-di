package com.springid.spring_di;

import com.springid.spring_di.controllers.ConstructorInjectedController;
import com.springid.spring_di.controllers.MyCrontoller;
import com.springid.spring_di.controllers.PropertyInjectedController;
import com.springid.spring_di.controllers.SetterInjectedController;
import com.springid.spring_di.services.GreetingServiceImpl;
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

		System.out.println("------- Property");
		PropertyInjectedController propertyInjectedController = ctx.getBean(PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----------- Settert");
		SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
		setterInjectedController.setGreetingService(new GreetingServiceImpl());
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----------- Constructor");
		ConstructorInjectedController constructorInjectedController = ctx.getBean(ConstructorInjectedController.class);
		constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
		System.out.println(constructorInjectedController.getGreeting());
	}

}
