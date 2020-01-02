package dao;
import entities.Customer;

import java.util.Map;
import java.util.Set;
public interface CustomerDao {

	
	void addCustomer(Customer e);
	

	Customer findCustomerByMobileNo(int mobileNo);
	Set<Customer> allCustomer();


	Map<Integer, Customer> getstore();


}
