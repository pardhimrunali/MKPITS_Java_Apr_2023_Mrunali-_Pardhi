package com.example.demoSpringBootOverview.rest;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component

public class CurrentAccount {


    @PostConstruct
    public void Startdouble()
    {
        System.out.println("start up work again"+getClass().getSimpleName());
    }
    @PostConstruct
    public void  startup()
    {
        System.out.println("start up work"+getClass().getSimpleName());
    }
    @PreDestroy

    public void endwork()
    {
        System.out.println("end up work");
    }
    @PreDestroy
    public void endworkdouble()
    {
        System.out.println("end up work double");
    }
}
