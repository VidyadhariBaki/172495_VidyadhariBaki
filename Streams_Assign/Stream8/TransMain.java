package com.cg.fruitsmain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.cg.streams.Trader;
import com.cg.streams.Transaction;

public class TransMain {

	public static void main(String[] args) {
		List<Transaction> list = new ArrayList<>();
		list.add(new Transaction(new Trader("Bob", "Mp"), 2011, 4532));
		list.add(new Transaction(new Trader("John", "Chennai"), 2013, 5000));
		list.add(new Transaction(new Trader("Singh", "kolkata"), 2011, 5000));
		list.add(new Transaction(new Trader("Raj", "Mumbai"), 2012, 3500));
		list.add(new Transaction(new Trader("Jhonson", "Bangalore"), 2011, 1600));

		List<Trader> traderlist = list.stream().filter(t -> t.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue)).map(Transaction::getTrader)
				.collect(Collectors.toList());
		traderlist.forEach(System.out::println);

	}

}