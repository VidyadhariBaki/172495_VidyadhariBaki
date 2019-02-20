package com.cg.fruitsmain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.cg.streams.Trader;
import com.cg.streams.Transaction;

public class TradersInDelhi {


	public static void main(String[] args) {
		List<Transaction> list = new ArrayList<>();
		list.add(new Transaction(new Trader("Bob", "Mp"), 2011, 4532));
		list.add(new Transaction(new Trader("John", "Delhi"), 2013, 5000));
		list.add(new Transaction(new Trader("Singh", "kolkata"), 2011, 5000));
		list.add(new Transaction(new Trader("Raj", "Mumbai"), 2012, 3500));
		list.add(new Transaction(new Trader("Jhonson", "Delhi"), 2011, 1600));

		
		List<Transaction> trans2=list.stream()
				.filter(p->p.getTrader().getCity()=="Delhi")
				.collect(Collectors.toList());
		trans2.forEach(e->System.out.println("Transaction value is: "+e.getValue()+" done by "+e.getTrader().getName()));
	}
		
}
