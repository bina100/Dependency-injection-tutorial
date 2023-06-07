package com.example.L93105.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{
    @Override
    public String getGreeting() {
        return "yo - SetterGreetingService";
    }
}
