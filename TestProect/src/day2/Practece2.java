package day2;

import java.util.Scanner;

public class Practece2 {
	
	public static void main(String[] args) {
		int x,y;
		System.out.println("Enter the first number");
		Scanner sc=new Scanner(System.in);
	    int	a=sc.nextInt();
	         
		System.out.println("Enter the secound number");
		Scanner sc1=new Scanner(System.in);
		int b=sc1.nextInt();
		
		if(a>b) {
			x=a;
			System.out.println(a +"is the lorgest number");
		}
			
			else {	
				y=b;
			
			System.out.println(b +"is the lorgest number");
			}
		
	}

}
