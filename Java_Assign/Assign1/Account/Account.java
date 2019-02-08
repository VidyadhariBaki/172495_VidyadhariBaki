package com.cg.dto;

public class Account {

    public	String id;
	public String name;
	public int balance;
	public Account()
	{
		
	}
	public Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		System.out.println("id="+id+"   "+"name="+name+"   "+"balance="+balance);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	public int credit(int amount)
	{
		balance=amount+balance;
		System.out.println("Credited Amount:"+balance);
		return balance;
	}
	public int Debit(int amount)
	{
		if(amount<=balance)
		{
		 balance=balance-amount;
		 System.out.println("Debited Amount:"+balance);
		}
		else
		{
			System.out.println("Amount exceeds balance");
		}
		return balance;
	}
	
	public int transferTo(int Account,int amount)
	{
		if(amount<=balance)
		{
		 balance=balance-amount;
	System.out.println("Transferable Amount:"+ balance+" to  "+Account);
		}
		else
		{
			System.out.println("Amount exceeds balance");
		}
		return balance;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
}
