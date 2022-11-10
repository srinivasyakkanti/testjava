package day2;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		int n,mul =1;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		for(int i=1;i<= n;i++) {
			{
				mul= mul*i;
			}
			System.out.println("Factorial of "+n+" :"+mul);
			
		}
	}

}
