package com.cg.dp.App;

import com.cg.dto.Account;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1=new Account();
		Account a2=new Account("s1","adc",1000);
		a2.credit(700);
        a2.Debit(400);
        a2.transferTo(1234567,600);
        System.out.println(a2.toString());
	}

}
