package com.cg.lambda;

import java.util.ArrayList;

public class FirstLetterOfEcachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> word=new ArrayList<>();
		word.add("Apple");
		word.add("Orange");
		word.add("Banana");
		word.add("Guava");
		word.add("PineApple");
		System.out.println("List=");
		word.forEach(System.out::println);
		String list = word.stream().map(Apple -> 
		Character.toString(Apple.charAt(0))).reduce(" ", (a, b) -> a + b);
		System.out.println(list);
		
	

	}

}
