package com.springid.spring_di;

import com.springid.spring_di.controllers.*;
import com.springid.spring_di.services.ConstructorGreetingService;
import com.springid.spring_di.services.SetterGreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

		I18nController i18nController = ctx.getBean(I18nController.class);
		System.out.println(i18nController.sayhello());

		System.out.println("------ Primary bean");
		MyCrontoller myCrontoller = ctx.getBean(MyCrontoller.class);
		String greeting = myCrontoller.sayHello();
		System.out.println(greeting);

		System.out.println("------- Property");
		PropertyInjectedController propertyInjectedController = ctx.getBean(PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----------- Settert");
		SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
		setterInjectedController.setGreetingService(new SetterGreetingService());
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----------- Constructor");
		ConstructorInjectedController constructorInjectedController = ctx.getBean(ConstructorInjectedController.class);
		constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingService());
		System.out.println(constructorInjectedController.getGreeting());
	}

}
