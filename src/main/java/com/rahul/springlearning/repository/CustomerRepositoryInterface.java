package com.rahul.springlearning.repository;

import java.util.List;

import com.rahul.springlearning.model.Customer;

public interface CustomerRepositoryInterface {

	List<Customer> findAll();

}