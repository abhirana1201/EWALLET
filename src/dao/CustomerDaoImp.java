package dao;
import entities.Customer;
import entities.Customer;
import exceptions.CustomerNotFoundException;
import java.util.*;

public class CustomerDaoImp implements CustomerDao {
private Map<Integer,Customer> store= new HashMap<>();
@Override
public void addCustomer(Customer e)
{
store.put(e.getMobileNo(),e);	
}
@Override
public Customer findCustomerByMobileNo(int mobileNo)
{
	Customer e=store.get(mobileNo);
	if(e==null)
	{
		throw new CustomerNotFoundException("Customer not found"+mobileNo);
	}
	return e;
}
@Override
public Set<Customer> allCustomer()
{
Collection<Customer> customer=store.values();
Set<Customer> customerSet=new HashSet<>(customer);
return customerSet;
}
}
