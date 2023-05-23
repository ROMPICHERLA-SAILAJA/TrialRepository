package com.sailu.CustomerDataManagement.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.sailu.CustomerDataManagement.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>
{
	List<Customer> getAllCustomerData();
	
	List<Customer> findByNme(String name);
	
	Customer update(Customer customer);
	
	@Query("SELECT c FROM Customer c WHERE C.name=:name AND c.email=:email")
	List<Customer> validateCustomer(@Param ("name") String name,
			@Param("email") String email);
}
