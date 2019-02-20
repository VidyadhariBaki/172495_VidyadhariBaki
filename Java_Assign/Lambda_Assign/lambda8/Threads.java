package com.cg.lambda;

import java.util.Arrays;
import java.util.List;

public class Threads {

	public static void main(String[] args) {
		
		List<Integer> al =  Arrays.asList(2, 4, 3, 65, 7, 3, 4);

		Runnable run = () -> {
			al.forEach(System.out::println);

		};
		Thread t = new Thread(run);
		t.start();

		try {
			t.sleep(70000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 6; i < 10; i++) {
			System.out.println("Mythread" + i);
		}
	}
}
