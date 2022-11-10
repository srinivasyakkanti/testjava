package day1;

abstract class animal {
	
	public abstract void animalSound();
	
	public void sleep() {
		
		System.out.println("ZZZ");
	}

}

class Pig extends animal{

	@Override
	public void animalSound() {
	
		System.out.println("abstrct method");
		
	}
}
class main{
	public static void main(String[] args) {
		
		Pig mypig =new Pig();
		mypig.animalSound();
		mypig.sleep();
	}
}