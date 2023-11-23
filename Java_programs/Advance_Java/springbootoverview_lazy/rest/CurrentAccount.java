package com.example.demoOverviewofSpringBoot.rest;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CurrentAccount implements Account{
    public CurrentAccount() {
        System.out.println("current");
    }

    @Override
    public String details() {
        return "current index";
    }
}
