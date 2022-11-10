package day1;

import java.util.Scanner;

public class PrintASCII {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ASCII character");
		char chr=sc.next().charAt(0);
		int asciiValue=chr;
		System.out.println("ASCII value of"+chr+"is:"+asciiValue);
	}

}
