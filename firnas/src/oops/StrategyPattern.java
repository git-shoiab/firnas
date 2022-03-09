package oops;

public class StrategyPattern {
	public static void main(String[] args) {
		BadBrush shaitan=new BadBrush();
		shaitan.doPaint(1);
		
		GoodBrush angel=new GoodBrush();
		angel.doPaint(new BluePaint());
	}
}

class BadBrush{
	public void doPaint(int n) {
		if(n==1) {
			System.out.println("red colour...");
		}
		else if(n==2) {
			System.out.println("blue colour...");
		}
		else if(n==3) {
			System.out.println("green colour....");
		}
	}
}

//To eliminate the if-else-if ladder - implement strategy pattern

/*
	3 golden rules
	1. Convert the condition to classes.
	2. Group the classes under a common hierarchy
	3. create a association between the using class and the hierarchial class
*/
abstract class Paint{
	
}
class RedPaint extends Paint{
	
}
class BluePaint extends Paint{
	
}
class GoodBrush{
	
	public void doPaint(Paint paint) {
		System.out.println(paint);
		
	}
}