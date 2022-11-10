package day2;

import java.util.Scanner;

public class UpperCaseToLowerCase {
	
	public static void main(String[] args) {
		
		System.out.println("Enter an Alphabet in uppercase:");
		Scanner scan =new Scanner(System.in);
		char chUpper =scan.next().charAt(0);
		
		int ascii=chUpper;
		if(ascii>=65 && ascii<=90)
		{
			ascii=ascii+32;
			char chLower=(char)ascii;
			System.out.println("Equivalent Character in Lowercase = " +chLower);
		}
		else if(ascii>=97 && ascii<=122)
		{
			System.out.println("\nalphabet is already in lowercase.");
		}
		else
		{
			System.out.println("\ninvalid input");
		}
	}

}
