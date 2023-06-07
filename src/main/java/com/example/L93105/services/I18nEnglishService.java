package com.example.L93105.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//הגדרת שם ל bean כדי שידע לגשת ל english ולא ל spain
// הוספת ערך דיפולטיבי אם לא נתתי ערך הוא יבחר באנגלית ולא בספרדית
@Profile({"EN", "default"})
@Service("i18nService")
public class I18nEnglishService implements GreetingService{


    @Override
    public String getGreeting() {
        return "Yo- English";
    }
}
