package com.example.L93105;

import com.example.L93105.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class L93105Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(L93105Application.class, args);
		//		Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(beanName-> System.out.println(beanName));

		//כשאני נגשת לבין אני צריכה להגיד לו מאיזה סוג הוא מחזיר
		MyController myController = (MyController) applicationContext.getBean("myController");
		//בלי ליצור אוביקט הצלחתי לקרוא לפונקציה שבתוך המחלקה
		System.out.println(myController.sayHello());

	}

}
