package com.cg.fruitsmain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.cg.streams.Trader;

public class TradersNamesSorted {
	public static void main(String[] args) {
		List<Trader> list = new ArrayList<>();
		list.add(new Trader("Ram", "Indore"));
		list.add(new Trader("sasi", "Hyderabad"));
		list.add(new Trader("Dillesh", "Mumbai"));
		list.add(new Trader("Srinivas", "Pune"));
		list.add(new Trader("Gopi", "Hyderabad"));
		list.add(new Trader("Mahesh", "Bangalore"));
		list.add(new Trader("Sai", "Pune"));
		list.add(new Trader("Rishi", "Mumbai"));
		list.add(new Trader("Ramesh", "Indore"));
		list.add(new Trader("Sai", "Chenai"));
		

		System.out.println("Traders names =");
		List<Trader> tradernames=list.stream()
				.sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList());
		String Str=tradernames.stream()
				.map(Trader::getName)
				.collect(Collectors.joining(", "));
		System.out.println(Str);
	}
}
