package day2;

import java.util.Scanner;

public class XToThePowerOfY {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the base value");
		int r=1;
		int i=1;
		Scanner in=new Scanner(System.in);
		int b = in.nextInt();
		int e= in.nextInt();
		
		while(i<=e){
			r*=b;
			i++;
		}
		System.out.println("\nResult:: " +b+ "^" + e + " = " + r + "\n");
		
	}

}
