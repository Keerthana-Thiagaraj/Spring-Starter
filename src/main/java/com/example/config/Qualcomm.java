package com.example.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Qualcomm implements Processor {


    public void process()
    {
        System.out.println("qualcomm processor");
    }
}
