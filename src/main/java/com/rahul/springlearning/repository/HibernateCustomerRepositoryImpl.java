package com.rahul.springlearning.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.rahul.springlearning.model.Customer;

@Repository("customerRepository")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HibernateCustomerRepositoryImpl implements CustomerRepositoryInterface {

	@Value("${dbUserName}")
	private String dbUserName;
	
	private List<Customer> customerList = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.rahul.springlearning.repository.CustomerRepositoryInterface#findAll()
	 */
	@Override
	public List<Customer> findAll() {

		System.out.println(dbUserName);
		
		if (customerList == null) {
			Customer customer = new Customer();
			customer.setFirstName("rahul");
			customer.setLastName("kumar");
			customerList = new ArrayList<Customer>();
			customerList.add(customer);
		}
		return customerList;
	}

}
