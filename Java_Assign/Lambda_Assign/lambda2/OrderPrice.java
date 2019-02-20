package com.cg.lambda;

public class OrderPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orders order = (x, y) -> {
			if (x > 10000) {
				System.out.println("Order price=" + x + "Satus=" + y);
			}
			else
			{
				System.out.println("Order price="+x+"Status="+y);
			}
		};
order.orderstatus(15000.78, "Accepted");
order.orderstatus(6000.00, "Declined");
order.orderstatus(9934.43, "Declined");
order.orderstatus(50000.34, "Completed");
order.orderstatus(10101.54, "Accepted");
order.orderstatus(5324.53, "Declined");
	}

}
