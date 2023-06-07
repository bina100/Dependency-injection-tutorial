package com.example.L93105;

import com.example.L93105.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
public class L93105Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(L93105Application.class, args);
//		Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(beanName-> System.out.println(beanName));

		//כשאני נגשת לבין אני צריכה להגיד לו מאיזה סוג הוא מחזיר
		MyController myController = (MyController) applicationContext.getBean("myController");
		//בלי ליצור אוביקט הצלחתי לקרוא לפונקציה שבתוך המחלקה
		System.out.println(myController.sayHello());


		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)  applicationContext.getBean("propertyInjectedController");
		System.out.println( propertyInjectedController.getGreeting());

		 SetterInjectedController setterInjectedController = (SetterInjectedController)  applicationContext.getBean("setterInjectedController");
		System.out.println( setterInjectedController.getGreeting());

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)  applicationContext.getBean("constructorInjectedController");
		System.out.println( constructorInjectedController.getGreeting());


//		בדף application.properties נגדיר את השפה שבחרנו ע"י  spring.profiles.active=SP וככה אני אוכל לשנות את השפה בצורה קלה ולפי ה profile שהגדרנו הוא ילך ויביא את ה service המתאים
		I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
		System.out.println( i18nController.getGreeting());
	}

}
