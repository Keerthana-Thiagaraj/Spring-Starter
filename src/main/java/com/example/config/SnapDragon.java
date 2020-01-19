package com.example.config;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements Processor {

    public void process()
    {
        System.out.println("snap processor");
    }

}

