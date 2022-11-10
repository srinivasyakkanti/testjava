package day2;

import java.util.LinkedList;

public class String_ex {
	
	public static void main(String[] args) {
		
		LinkedList<String> st=new LinkedList<String>();
		st.add("Hero");
		st.add("Hondha");
		st.add("sender");
		st.add("pulsure");
		st.add("duke");
		st.add("discover");
		st.add("avenger");
		
		st.forEach((n)->{System.out.println(n);});
		
	}

}
