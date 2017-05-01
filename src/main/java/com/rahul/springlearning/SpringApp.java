package com.rahul.springlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rahul.springlearning.service.CustomerService;
import com.rahul.springlearning.service.CustomerServiceImpl;

public class SpringApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService customerService = context.getBean("customerService",CustomerService.class);
		System.out.println(customerService.findAll().get(0).getFirstName());
		
		CustomerService customerService1 = context.getBean("customerService",CustomerService.class);
		System.out.println(customerService1.findAll().get(0).getFirstName());
		
		customerService.findAll().get(0).setFirstName("Sahukar");
		
		System.out.println(customerService.findAll().get(0).getFirstName());
		System.out.println(customerService1.findAll().get(0).getFirstName());
		
		System.out.println(customerService +"\n"+customerService1);

	}

}
