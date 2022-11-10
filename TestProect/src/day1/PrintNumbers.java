package day1;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the munium number");
		int i=sc.nextInt();
		
		for(int a=1;a<=i;a++) {
			System.out.println("The number is:"+a);
		}
		
	}

}
