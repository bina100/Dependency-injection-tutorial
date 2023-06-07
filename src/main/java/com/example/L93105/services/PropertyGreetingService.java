package com.example.L93105.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService{
    @Override
    public String getGreeting() {
        return "Yo - PropertyGreetingService";
    }
}
