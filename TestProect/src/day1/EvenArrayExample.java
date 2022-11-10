package day1;

public class EvenArrayExample {
	
	
	public static void main(String[] args) {
	
	int x[]= {1,2,3,4,5,6,7,8,9,10};
	
	System.out.println("Odd numbers:");
	for(int i=0;i<x.length;i++)
	{
		if(x[i]%2!=0) 
		{
			System.out.println(x[i]);
			
		}
	}
	
	System.out.println("Even numbers");
	for(int i=0;i<x.length;i++)
	{
		if(x[i]%2==0) 
		{
			System.out.println(x[i]);
		}
	}

	
	}

}
