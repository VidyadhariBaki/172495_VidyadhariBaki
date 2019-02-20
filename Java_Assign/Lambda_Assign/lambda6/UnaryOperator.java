package com.cg.lambda;

import java.util.ArrayList;
import java.util.List;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		names.add("vidya");
		names.add("dilesh");
		names.add("srinivas");
		names.add("gopi");
		names.add("madhu");
		System.out.println("List=");
		names.forEach(System.out::println);
		System.out.println("Converting UpperCase=");
		names.replaceAll(x -> x.toUpperCase());
		names.forEach(System.out::println);

	}

}
