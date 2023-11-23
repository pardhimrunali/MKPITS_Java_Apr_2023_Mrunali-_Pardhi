package com.example.demoOverviewofSpringBoot.rest;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class SavingAccount implements Account{

    public SavingAccount() {
        System.out.println("saving ");
    }

    @Override
    public String details() {
        return "saving Index";
    }
}
