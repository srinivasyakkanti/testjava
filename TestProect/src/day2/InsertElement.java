package day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.function.Consumer;


public class InsertElement {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> s=new ArrayList <Integer>();
		
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);
		s.add(10);
		s.forEach((n)->{System.out.println(n);});
		
		Consumer<Integer> method = (n) ->{ System.out.println(n);};
		s.forEach(method);
		
		
		
		
				
	}

}
