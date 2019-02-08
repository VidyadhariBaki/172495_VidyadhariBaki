package com.cg.ass.dto;
public class Account
{
	
private int id;
private Customer customer;
private double balance;

public Account(int id, Customer customer,double balance) {
	this.id = id;
	this.customer = customer;
	this.balance = balance;
	
}

@Override
public String toString() {
	return "Account [id=" + id + ", customer=" + customer + ", balance=" + balance + "]";
}

public int getId() {
	return id;
}



public Customer getCustomer() {
	return customer;
}	

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public double deposit( double amount) 
{
   System.out.println("Amount deposited");
return amount+balance;	
}

public double withdraw( double amount)
{
   if(balance>= amount)
   {
	  System.out.println("Subtract amount to balance");
	  balance=balance-amount;
   }
	   else
	   {
		   System.out.println("amount withdrawn exceed the current balance");
	  
   }
   return balance;

}
}

