package com.cg.fruitsmain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.cg.streams.Trader;

public class TradersFromPune {
	public static void main(String[] args) {
		List<Trader> list = new ArrayList<>();
		list.add(new Trader("Ram", "Pune"));
		list.add(new Trader("sasi", "Hyderabad"));
		list.add(new Trader("Dillesh", "Mumbai"));
		list.add(new Trader("Srinivas", "Pune"));
		list.add(new Trader("Gopi", "Hyderabad"));
		list.add(new Trader("mahesh", "Bangalore"));
		list.add(new Trader("Sai", "Pune"));
		list.add(new Trader("rishi", "Mumbai"));
		list.add(new Trader("ramesh", "Pune"));
		list.add(new Trader("Sai", "Chenai"));
		System.out.println("Unique Cities:");

		List<Trader> names = list.stream().filter(p -> p.getCity() == "Pune")
				.sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
		names.forEach(System.out::println);
	}
}
