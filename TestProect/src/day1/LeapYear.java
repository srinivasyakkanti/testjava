package day1;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
	int	year;
	System.out.println("Enter the Year");
	Scanner sc=new Scanner(System.in);
	int year1=sc.nextInt();
	if(((year1 % 4 == 0) && (year1 %  100 == 0)) || ((year1%400 == 0) &&(year1 %  100 == 0))) {
		
		System.out.println("Specified year is a leapyear");
	}
	else {
		System.out.println("Specified year is not leapyear");
	}
	
	
	}

}
