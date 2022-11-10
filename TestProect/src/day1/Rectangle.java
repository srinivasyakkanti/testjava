package day1;

import java.util.Scanner;

public class Rectangle {
	
	
	public static void main(String[] args) {
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the length");
		int l=sc1.nextInt();
		       //scanf("%d",&length);
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter the breadth");
		int b=sc2.nextInt();
		        //scanf("%d",&breadth);
		int area=l*b;
		System.out.println("Area of rectangle is:"+area);
	}

}
