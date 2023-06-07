package com.example.L93105.controllers;
//ננסה לדמות את dependency injection בלי להשתמש בספרינג

import com.example.L93105.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    @Autowired
    @Qualifier("setterGreetingService")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return "In SetterInjectedController: "+greetingService.getGreeting();
    }
}
