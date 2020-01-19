package com.example.config;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.config")
public class Config {


    /*** Rather than defining bean separately, use component scan which scans the classes named with @component ***/

//    @Bean
//    public Phone getPhoneObject()
//    {
//        return new Phone();
//    }
//
//    @Bean
//    public Processor getProcessor()
//    {
//        return new SnapDragon();
//    }
}
