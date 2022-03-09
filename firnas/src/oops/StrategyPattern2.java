package oops;

public class StrategyPattern2 {
	public static void main(String[] args) {
		GoodDog tiger=new GoodDog();
		
		tiger.play(new Stick());
	}
}


class Dog{
	public void play(String item) {
		if(item.equals("stick")) {
			System.out.println("dog bites......");
		}
		else if(item.equals("stone")) {
			System.out.println("dog barks.....");
		}
		else if(item.equals("biscuit")) {
			System.out.println("dog wags tail....");
		}
	}
}
abstract class Item{
	public abstract void action() ;
}
class Stick extends Item{
	public void action() {
		System.out.println("dog bites....");
	}
}
class Stone extends Item{
	public void action() {
		System.out.println("dog barks................................");
	}
}
class GoodDog{
	public void play(Item item) {
		item.action();
	}
}