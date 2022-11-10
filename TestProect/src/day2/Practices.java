package day2;

public class Practices {
	
	public static void main(String[] args) {
		
		String s="My name is srinivas";
		String rev ="   ";
		int length=s.length();
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse String is:" + rev);
	}

}
