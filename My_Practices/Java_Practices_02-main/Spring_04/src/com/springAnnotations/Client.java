package com.springAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College clg = context.getBean("colBean", College.class);
		clg.test();
	}

}
