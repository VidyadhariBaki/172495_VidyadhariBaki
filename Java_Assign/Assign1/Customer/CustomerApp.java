package com.cg.dp.App;

import com.cg.dto.Customer;
import com.cg.dto.DiscountRate;
import com.cg.dto.Visit;

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c=new Customer("dfdg");
	
	c.setMemberType("premium");
	 c.isMember(true);
Visit v=new Visit();
v.setServiceExpense(10000);
v.setProductExpense(5000);
v.getTotalExpense();
DiscountRate d=new DiscountRate();
d.serviceDiscountRate();
d.productDiscountRate();
	}

}
