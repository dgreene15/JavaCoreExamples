package com.dwg.services;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Looping {

	public static void main(String[] args) {

		//testMap();
		testList();
		
	}
	
	public static void testList() {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		
		for(String e : items) {
			System.out.println(e);
		}
		
		items.forEach(item->System.out.println(item));
		
		items.forEach(item -> {
			if(item.equals("A")) {
				System.out.println(item);
			}
		});
		
		items.forEach(System.out::println);
		
		items.stream()
			 .filter(s -> s.contains("B"))
			 .forEach(System.out::println);
	}

	public static void testMap() {
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
		
		items.forEach((k,v)->System.out.println("item: " + k + " Count: " + v));
		
		items.forEach((k,v)->{
			System.out.println("Item: " + k);
			if("E".equals(k)) {
				System.out.println("Hello E");
			}
		});
	}
}
