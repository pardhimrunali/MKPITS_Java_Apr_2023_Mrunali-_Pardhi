package com.example.demoSpringBootOverview.rest;

public class LoanAccount implements Account{
    @Override
    public String display() {
        return  "loan Account";
    }
}
