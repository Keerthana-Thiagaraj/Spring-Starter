package com.example.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Defining beans inside config class
//Avoiding bean declaration and using component scan
// usage of @Component ensures creation of objects of that particular class
//Annotations usage
//Annotation based config
// What happens if 2 classes implements one interface (usage of @Primary or @Qualifier)

public class App {
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Phone p=context.getBean(Phone.class);
        p.samsung();
    }
}
