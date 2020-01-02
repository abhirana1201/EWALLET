package service;


import entities.Customer;
import java.util.Set;


public interface CustomerService {
	Customer addEmployee(Customer e);

	Customer findCustomerByMobileNo(int mobileNo);

	Set<Customer> allCustomer();
}
