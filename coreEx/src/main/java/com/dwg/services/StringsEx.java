package com.dwg.services;

public class StringsEx {

	public static void main(String[] args) {
		String fname = "FName";
		String lname = "LName";

		// StringBuffer - thread safe (java.lang)
		// dwg2
		StringBuffer sb = new StringBuffer("name: ");
		sb.append(fname);
		sb.append(lname);
		System.out.println(sb);
		
		// StringBuilder - non-thread safe (java.lang)
		StringBuilder sb2 = new StringBuilder("name: ");
		sb2.append(fname);
		sb2.append(lname);
		System.out.println(sb2.toString());
	}

}
