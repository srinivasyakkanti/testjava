package day2;

import java.util.Scanner;

public class CountIntegers {
	
	public static void main(String[] args) {
	
	int count = 0;
	
	Scanner sc =new Scanner (System.in);
	
	System.out.println("Enter the number::");
	
	int num=sc.nextInt();
	
	while(num!= 0) {
		num = num/10;
		count++;
	}
	System.out.println("Number of the digits in the entered integer are: : " + count);
	   		
   } 
}
