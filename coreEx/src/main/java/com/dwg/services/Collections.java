package com.dwg.services;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		
		Collection<String> collection = new HashSet<String>();
		collection.add("darren");
		collection.add("greene1");
		collection.add("greene1");
		collection.add("greene2");
		
		Iterator<String> iter = collection.iterator();
		while(iter.hasNext()) {
			String val = (String)iter.next();
			System.out.println(val);;
		}
	}

}
