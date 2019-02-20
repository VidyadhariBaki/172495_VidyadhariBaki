package com.cg.fruitsmain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.cg.streams.Fruits;

public class RedColorFruits {

	public static void main(String[] args) {
		List<Fruits> fruit = new ArrayList<>();
		fruit.add(new Fruits("Mango", 30, 110, "Yelow"));
		fruit.add(new Fruits("promogranate", 40, 100, "Red"));
		fruit.add(new Fruits("Strwaberry", 110, 170, "Red"));
		fruit.add(new Fruits("Watermelon", 100, 40, "Green"));
		fruit.add(new Fruits("Banana", 40, 30, "Yellow"));
		fruit.add(new Fruits("Guava", 120, 70, "Green"));
		fruit.add(new Fruits("Apple", 60, 30, "Red"));

		List<String> names2 = fruit.stream().filter(p -> p.getColor() == "Red")
				.sorted(Comparator.comparing(Fruits::getPrice)).map(Fruits::getName).collect(Collectors.toList());
		names2.forEach(System.out::println);
	}
}
