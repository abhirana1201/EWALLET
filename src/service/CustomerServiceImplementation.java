package service;



import dao.CustomerDao;
import entities.Customer;
import exceptions.IncorrectIdException;

import java.util.Set;

public class CustomerServiceImplementation implements CustomerService {
    private CustomerDao dao;

    public CustomerServiceImplementation(CustomerDao dao) {
        this.dao = dao;
    }

    @Override
    public void addEmployee(Customer e) {
        dao.addCustomer(e);
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

