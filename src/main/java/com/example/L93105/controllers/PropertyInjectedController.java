package com.example.L93105.controllers;
//ננסה לדמות את dependency injection בלי להשתמש בספרינג

import com.example.L93105.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;
    public String getGreeting(){
        return "In PropertyInjectedController: "+greetingService.getGreeting();
    }
}
