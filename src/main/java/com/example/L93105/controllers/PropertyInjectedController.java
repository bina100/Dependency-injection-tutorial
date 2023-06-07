package com.example.L93105.controllers;
//ננסה לדמות את dependency injection בלי להשתמש בספרינג

import com.example.L93105.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//הוספה כדי שיהיה bean בשביל שינוהל ע"י ספרינג
@Controller
public class PropertyInjectedController {
    //מעביר את הניהול לידיים של המפתח ולא מטפל בשגיאות שיכולות להיות
    @Autowired
    //משייך אותו לשם של ה bean שאני רוצה להשתמש בו כי בעצם יש 3 מימושים ואני ארצה שכל קונטרולר ילך למימוש המתאים לו אז אני נותנת לו את השם
    @Qualifier("propertyGreetingService")
    GreetingService greetingService;
    public String getGreeting(){
        return "In PropertyInjectedController: "+greetingService.getGreeting();
    }
}
