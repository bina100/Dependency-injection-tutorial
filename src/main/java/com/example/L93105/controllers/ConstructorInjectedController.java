package com.example.L93105.controllers;

import com.example.L93105.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//ננסה לדמות את dependency injection בלי להשתמש בספרינג
//יכול להיות private ו final
//הסוג של קונסטרקטור הכי טוב מאשר פרופרטי וסט שעשינו קודם
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController( @Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return "In ConstructorInjectedController: "+greetingService.getGreeting();

    }
}
