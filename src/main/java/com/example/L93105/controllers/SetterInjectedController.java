package com.example.L93105.controllers;
//ננסה לדמות את dependency injection בלי להשתמש בספרינג

import com.example.L93105.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return "In SetterInjectedController: "+greetingService.getGreeting();
    }
}
