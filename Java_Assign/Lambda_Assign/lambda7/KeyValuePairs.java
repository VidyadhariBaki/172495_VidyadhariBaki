package com.cg.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeyValuePairs {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Vidya", "Vsp");
		map.put("Dillesh", "sklm");
		map.put("Srinivas", "Guntur");
		map.put("Gopi", "Banglore");

		StringBuilder str = new StringBuilder();
		Set<Map.Entry<String, String>> s1 = map.entrySet();

		for (Map.Entry<String, String> val : s1) {
			str = str.append(val.getKey() + "" + val.getValue());
		}

		System.out.println(str);

	}

}
