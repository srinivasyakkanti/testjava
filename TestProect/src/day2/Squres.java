package day2;

import java.util.Scanner;

public class Squres {
	
	public static void main(String[] args) {
		
		int n, square;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		square= n*n;
		System.out.println("The square of given number " +n+ " = " + square);
	
	}

}
