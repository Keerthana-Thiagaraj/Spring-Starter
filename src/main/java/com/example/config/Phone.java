package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //creates object for this class

public class Phone {

    @Autowired   // Linkage of classes
    @Qualifier("qualcomm")
    Processor p;

    public Processor getP() {
        return p;
    }

    public void setP(Processor p) {
        this.p = p;
    }

    public void samsung()
    {
        System.out.println("samsung s10");
        p.process();
    }
}
