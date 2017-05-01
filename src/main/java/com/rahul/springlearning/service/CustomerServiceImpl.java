package com.rahul.springlearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.rahul.springlearning.model.Customer;
import com.rahul.springlearning.repository.CustomerRepositoryInterface;

@Service("customerService")
//@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepositoryInterface customerRepository;//  = new HibernateCustomerRepositoryImpl();
	
	public CustomerServiceImpl() {
	}
	
	public CustomerServiceImpl(CustomerRepositoryInterface customerRepository) {
		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see com.rahul.springlearning.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		
		return customerRepository.findAll();
		
	}
	
	@Autowired
	public void setCustomerRepository(CustomerRepositoryInterface customerRepository) {
		this.customerRepository = customerRepository;
	}

}
