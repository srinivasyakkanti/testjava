package day1;

import java.util.Scanner;

public class PrintEvenNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the highest number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println("The number is:"+i);
			}
			
		}
	}

}
