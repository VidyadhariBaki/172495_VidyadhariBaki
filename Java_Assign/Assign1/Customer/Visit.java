package com.cg.dto;

import java.util.Date;

public class Visit
{
	public Visit()
	{
		
	}
	private static double serviceExpense; 
	private static double productExpense; 
	Date date;
	

	public static double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}

	public static double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}

	public static double getTotalExpense() 
	{
		double  totalExpense = serviceExpense + productExpense;
		System.out.println("Welcome to "+ Customer.getName());
		System.out.println("Total Expenses= "+ totalExpense);
		return totalExpense;
	}
	
	
	
}
