package ui;

import dao.CustomerDaoImp;

import entities.Customer;

import service.CustomerServiceImplementation;

import service.CustomerService;
import java.util.Collection;
import java.util.Set;

public class CustomerUi {
	private CustomerService service = new CustomerServiceImplementation(new CustomerDaoImp());

    public static void main(String[] args) {
        CustomerUi ui = new CustomerUi();
        ui.runUi();
    }
    public void runUi() {
        try {
            Customer e1 = new Customer("abhinav", 989104467,200);
            Customer e2 = new Customer("rama", 989101336,1000);
            service.addEmployee(e1);
            service.addEmployee(e2);
            Customer fetched1 = service.findCustomerByMobileNo(989104467);
            Customer fetched2 = service.findCustomerByMobileNo(989101336);
            System.out.println(fetched1.getName());
            System.out.println(fetched2.getName());
            System.out.println("********printing all employees****");
            Set<Customer> customer = service.allCustomer();
            print(customer);
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println("something went wrong");
        }
    }
    void print(Collection<Customer>customer){
        for (Customer e:customer){
            System.out.println(e.getName());
}
    }
}
    
