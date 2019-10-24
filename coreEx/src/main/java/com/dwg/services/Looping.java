package com.dwg.services;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class Looping {

	public static void main(String[] args) {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);


		for(Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Key: " + entry.getKey() + "  " + "Value: " + entry.getValue());
		}
		
		for(String key : items.keySet()) {
			System.out.println(key);
		}
		
		for(Integer value : items.values()) {
			System.out.println(value);
		}
		
	}

}
