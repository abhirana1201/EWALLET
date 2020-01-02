package service;

import java.util.Map;

import dao.CustomerDao;
import dao.CustomerDaoImp;
import entities.Customer;
import service.CustomerService;
import service.CustomerServiceImplementation;
import org.junit.*;
import java.util.Map;

public class EwalletServiceImplementationTest {
	@Test
	public void testCreateAccount_1() {

		CustomerServiceImplementation service = new CustomerServiceImplementation(new CustomerDaoImp());
	CustomerDao dao;
	
		String name = "abhinav";
		int mobileNo = 989101446;
		int balance = 1000;
		 Customer e=new Customer();
		Customer customer = service.addEmployee(e);
		Assert.assertNotNull(customer);
		Assert.assertNotNull(customer);
		Map<Integer, Customer> store = service.getdao().getstore();
		Customer expected = store.get(customer);
		Assert.assertNotNull(expected);
		Assert.assertEquals(expected, customer);
	}
}
