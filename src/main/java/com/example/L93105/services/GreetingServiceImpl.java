package com.example.L93105.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//בשביל להשתמש בספרינג הגדרנו אותו כ bean מסוג service
@Service
//מגדיר אותו כדיפולטיבי למי שאין Qualifire שמגדיר אותו
@Primary

public class GreetingServiceImpl implements GreetingService{

    @Override
    public String getGreeting() {
        return "Yo get greeting";
    }
}
