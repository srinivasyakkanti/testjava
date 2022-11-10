package day2;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {
	
	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volve");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		Iterator<String>it=cars.iterator();
		System.out.println(it.next());
	}

}
