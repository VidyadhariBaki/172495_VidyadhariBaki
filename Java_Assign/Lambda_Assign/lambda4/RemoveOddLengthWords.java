package com.cg.lambda;

import java.util.ArrayList;
import java.util.List;

public class RemoveOddLengthWords {
public static void main(String[] args) {
	List<String> names=new ArrayList<>();
	names.add("Vidya");
	names.add("Dilesh");
	names.add("Srinivas");
	names.add("Gopi");
	names.add("Madhu");
	System.out.println("List of names:");
	names.forEach(System.out::println);
	System.out.println("           ");
	System.out.println("EvenLength of names=");
	names.removeIf(a->a.length()%2!=0);
	names.forEach(System.out::println);
}
}
