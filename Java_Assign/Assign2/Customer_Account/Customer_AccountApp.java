package com.cg.app;

import com.cg.ass.dto.Account;
import com.cg.ass.dto.Customer;

public class Customer_AccountApp {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Customer c = new Customer(1,"vidya",'m');
			Account a3 = new Account(1234,c,9999.77);
			System.out.println("Account details");
			System.out.println(a3);
			a3.deposit(1001234);
			a3.withdraw(1767);
		}

}
