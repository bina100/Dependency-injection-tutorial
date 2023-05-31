package com.example.L93105.controllers;

import org.springframework.stereotype.Controller;
//מגדיר אותו שיהיה מסוג been ולא מסוג object
@Controller
public class MyController {

    public String sayHello(){
        return "Hii";
    }
}
