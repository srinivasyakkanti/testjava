package day1;

import java.util.Scanner;

public class PositiveOrNegative {
	
	public static void main(String[] args) {
	
	int num;
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	
	if(n>0) {
		
		System.out.println("positive number");
		
	}
	else {
		System.out.println("Negutive number");
	}
	
	}
}
