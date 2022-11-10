package day1;

import java.util.Scanner;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		int x,y,z;
		System.out.println("Enter the first number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the secound number");
		Scanner sc1=new Scanner(System.in);
		int b=sc1.nextInt();
		System.out.println("Enter the threed number");
		Scanner sc2=new Scanner(System.in);
		int c=sc2.nextInt();
		
		if(a>=b && a>=	c) {
			x = a;
			System.out.println(a+"is the largest number");
		     }
		
		else if(b>=a && b>=c) {
				y = b;
				System.out.println(b+"is the largest number");
			}
		
		else {
				z=c;
		System.out.println(c+"is the largest number");
			}	
		
	}

}
