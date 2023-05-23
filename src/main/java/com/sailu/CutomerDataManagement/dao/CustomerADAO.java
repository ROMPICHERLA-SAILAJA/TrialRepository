package com.sailu.CutomerDataManagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.sailu.CustomerDataManagement.entity.Customer;
import com.sailu.CustomerDataManagement.repository.CustomerRepository;

public class CustomerADAO
{
	@Autowired
	private CustomerRepository repository;
	
	public Customer saveCustomer(Customer customer)
	{
		return repository.save(customer);
	}
	public Customer update(Customer customer)
	{
		return repository.update(customer);
	}
	public List<Customer> getAllCustomerData()
	{
	   return repository.findAll();
		
	}
	public Customer getCustomerDataById(int id)
	{
		return repository.findById(id).orElse((new Customer(HttpStatus.NOT_FOUND.value(),HttpStatus.NOT_FOUND.name(),HttpStatus.NOT_FOUND.name())));
	}
	public Customer deleteCustomerDataById(int id)
	{
		Customer customer=getCustomerDataById(id);
		if(customer.getId()!=404)
		{
			repository.deleteById(id);
		}
		return customer;
	}
	public List<Customer>getCustomerByName(String name)
	{
		return repository.findByNme(name);
	}
	public List<Customer>validateCustomer(String name,String email)
	{
		return repository.validateCustomer(name, email);
		
	}
}
