package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.context.XmlServletWebServerApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Dependency injection
// Application context
//Usage of component
// Xml based configuration for beans
// Annotation based config using <context-component-scan>
// Constructor injection
// Setter injection

public class DemoApplication {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Bike b = (Bike) context.getBean("bike");
		b.drive();
	}

}
