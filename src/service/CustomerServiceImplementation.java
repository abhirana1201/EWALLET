package service;



import dao.CustomerDao;
import entities.Customer;
import exceptions.IncorrectIdException;

import java.util.Set;

public class CustomerServiceImplementation implements CustomerService {
	CustomerDao dao;
	public  CustomerDao getdao()
	{
		return dao;
	}

	public CustomerServiceImplementation(CustomerDao dao) {
		this.dao = dao;
	}

	@Override
	public Customer addEmployee(Customer e) {
		dao.addCustomer(e);
		return e;
	}

	@Override
	public Customer findCustomerByMobileNo(int mobileNo) {
		if (mobileNo < 0) {
			throw new IncorrectIdException("id is incorrect");
		}
		Customer e = dao.findCustomerByMobileNo(mobileNo);
		return e;
	}

	@Override
	public Set<Customer> allCustomer() {
		Set<Customer> customer = dao.allCustomer();
		return customer;
	}
}

