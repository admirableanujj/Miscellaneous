package com.gettrained.springboot.MyFirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyFirstProjectApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(MyFirstProjectApplication.class, args);
		
		for (String string : applicationContext.getBeanDefinitionNames()) {
			System.out.println(string);
			
		}
	}
}
