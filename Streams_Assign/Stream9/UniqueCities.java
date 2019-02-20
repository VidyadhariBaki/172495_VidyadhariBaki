package com.cg.fruitsmain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.cg.streams.Trader;

public class UniqueCities {
	

		public static void main(String[] args) {
			List<Trader> list=new ArrayList<>();
			list.add(new Trader("Ram", "Pune"));
			list.add(new Trader("sasi","Hyderabad"));
			list.add(new Trader("Srinivas", "Mumbai"));
			list.add(new Trader("Dillesh", "Pune"));
			list.add(new Trader("Gopi", "Hyderabad"));
			list.add(new Trader("mahesh", "Bangalore"));
			list.add(new Trader("Sai", "Pune"));
			list.add(new Trader("rishi", "Mumbai"));
			list.add(new Trader("ramesh", "Pune"));
			list.add(new Trader("Sai", "Chenai"));
			System.out.println("Unique Cities:");
			List<String> city=list.stream()
					.map(Trader::getCity)
					.distinct()
					.collect(Collectors.toList());
			city.forEach(System.out::println);
			
			
}
}