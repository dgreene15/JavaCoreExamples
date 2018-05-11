package coreEx;

public class StringsEx {

	public static void main(String[] args) {
		String fname = "FName";
		String lname = "LName";

		// StringBuffer - thread safe (java.lang)
		StringBuffer sb = new StringBuffer("name: ");
		sb.append(fname);
		sb.append(lname);
		System.out.println(sb);
		
		// StringBuilder - non-thread safe (java.lang)
		// dwg
		StringBuilder sb2 = new StringBuilder("name: ");
		sb2.append(fname);
		sb2.append(lname);
		System.out.println(sb2.toString());
	}

}
