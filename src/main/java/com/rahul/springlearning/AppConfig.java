package com.rahul.springlearning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.rahul.springlearning.service.CustomerService;
import com.rahul.springlearning.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.rahul.springlearning"})
@PropertySource("app.properties")
public class AppConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean(name="customerService")
	@Scope("prototype")
	public CustomerService getCustomerService(){
		// Below line for Constructor injection
		//CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		CustomerServiceImpl service = new CustomerServiceImpl();
		//service.setCustomerRepository(getCustomerRepository());
		return service;
	}
	
	//@Bean(name="customerRepository")
	//public CustomerRepositoryInterface getCustomerRepository(){
	//	return new HibernateCustomerRepositoryImpl();
	//}
}
