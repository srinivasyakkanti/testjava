package day1;

public class Swap {

	public static void main(String[] args)
	{
		int x=125;
		int y=224;
		System.out.println("Enter the original value of x and y");
		System.out.println("x="+x);
		System.out.println("y="+y);
		x=x^y^(y=x);
		System.out.println("Enter the swaped value of x and y");
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}
