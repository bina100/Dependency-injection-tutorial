package com.example.L93105.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//הגדרת שם ל bean  כדי שידע לגשת ל spain ולא ל english
@Profile("SP")
@Service("i18nService")
public class I18nSpanishService implements GreetingService{
    @Override
    public String getGreeting() {
        return "Yo - spanish";
    }
}
