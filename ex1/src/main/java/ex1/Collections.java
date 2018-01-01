package ex1;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		
		Collection collection = new HashSet();
		collection.add("darren");
		collection.add("greene1");
		collection.add("greene1");
		collection.add("greene2");
		
		Iterator iter = collection.iterator();
		while(iter.hasNext()) {
			String val = (String)iter.next();
			System.out.println(val);;
		}
	}

}
