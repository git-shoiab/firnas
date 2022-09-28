package oops;

public class OopsDemo9 {
	public static void main(String[] args) {
		Food food=new Briyani();
		food.hai();
	}
}

abstract class Food{
	public Food() {
		System.out.println("cons called...");
	}
	public void hai() {
		System.out.println("hai method called.....");
	}
	
	public abstract void hello();
}

class Briyani extends Food{
	public Briyani() {
		System.out.println("briyani cons called...");
	}
	@Override
	public void hello() {
		// TODO Auto-generated method stub
		
	}
}