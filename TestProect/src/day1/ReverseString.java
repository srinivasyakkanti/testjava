package day1;

public class ReverseString {
	
	public static void main(String[] agrs)
	{
		String s= "I am from india";
		String rev="  ";
		int length=s.length();
		
		for(int i=length-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse String is:"+rev);
		
			
		
	}

}
