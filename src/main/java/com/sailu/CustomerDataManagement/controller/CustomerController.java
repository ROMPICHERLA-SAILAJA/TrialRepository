package com.sailu.CustomerDataManagement.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sailu.CustomerDataManagement.entity.Customer;
import com.sailu.CutomerDataManagement.service.CustomerService;

public class CustomerController 
{
	@Autowired
	private CustomerService  service;
	
	@PostMapping("/customer")
	public@ResponseBody Customer saveCutomer(@RequestBody Customer customer)
	{
		return service.saveCustomer(customer);
	}
	@PutMapping("/Customer")
	public @ResponseBody Customer updateCustomer(@RequestBody Customer customer)
	{
	return service.updateCustomer(customer);
	}
	@GetMapping("/Customer")
	public List<Customer> getAllCustomerData()
	{
		return service.getAllCustomerData();
	}
	@GetMapping("/customer/{id}")
	public @ResponseBody Customer getCustomerDataById(@PathVariable("id")int id)
		{
			return service.getCustomerDataById(id);
		}
	@DeleteMapping("/customer")
	public @ResponseBody Customer deleteCustomerDataById(@RequestParam ("id")int id)
	{
		return service.deleteCustomerDataById(id);
	}
	@GetMapping("/customerbyname/{name}")
	public @ResponseBody List<Customer> getCustomerByName(@PathVariable("name")String name)
	{
		return service.getCustomerByName(name);
	}
	@PostMapping("/validateCustomer")
	public List<Customer> validateCustomer(@RequestParam("name")String name,@RequestParam("email")String email)
	{
		return service.validateCustomer(name,email);
		
	}
	

	
	
}
