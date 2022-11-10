package day1;

import java.util.Scanner;

public class ChechEvenOrOdd {
	
	public static void main(String[] args) {
		
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int E=sc.nextInt();
	
	if(E%2==0) {
		
		System.out.println(E+"is even");
		
		
	}else {
		System.out.println(E+"is add");
	}
	}

}
