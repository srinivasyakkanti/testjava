package day1;

public class DuplecateNumbers {
	
	public static void main(String[] args) {
		
		int x[]= {1,2,3,4,5,6,7,8,4};
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
				System.out.println(x[i]);
				return;
				}
			}
		}
	}

}
