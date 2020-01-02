package entities;

public class Customer {
	private String name;
	private int mobileNo;
	private int balance;

	public Customer()
	{
	}
	public Customer(String name,int mobileNo,int balance)
	{
		this.name=name;
		this.mobileNo=mobileNo;
		this.balance=balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void transfer(Customer obj,int transferAmount)
	{
		obj.balance=obj.balance+transferAmount;
		this.balance=this.balance-transferAmount;
	}
	@Override
	public String toString()
	{
		String display=name+" "+mobileNo+" "+balance;
		return display;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj==this)
			return true;

		if(obj==null || !(obj instanceof Customer))
			return false;

		Customer e=(Customer)obj;
		return e.mobileNo==this.mobileNo;
	}
	@Override
	public int hashCode() {
		return mobileNo;
	}
}
