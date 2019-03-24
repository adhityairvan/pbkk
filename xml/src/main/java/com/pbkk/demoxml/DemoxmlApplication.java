package com.pbkk.demoxml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoxmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoxmlApplication.class, args);
		ApplicationContext context=new ClassPathXmlApplicationContext("demoxml.xml");
		AppXML app = context.getBean("AppXML",AppXML.class);
		app.drawShape();
	}

}
