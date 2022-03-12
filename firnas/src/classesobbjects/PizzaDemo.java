package classesobbjects;

public class PizzaDemo {
	public static void main(String[] args) {
		Dominos chennai=new KyivDominos();//new ChennaiDomino();
		
		chennai.sellPizza();
	}
}

abstract class Dominos{
	private void makeDough() {
		System.out.println("dominos ways of making dough..");
	}
	private void makeIngredients() {
		System.out.println("dominos way of making ingredients...");
	}
	private void bakeDough() {
		System.out.println("dominos way of baking dough...");
	}
	private void addIngredients() {
		System.out.println("dominos way of adding ingredients...");
	}
	
	private void makePizza() {//template method
		makeDough();
		makeIngredients();
		bakeDough();
		addIngredients();
	}
	final public void sellPizza() {//template method
		getMoney();
		makePizza();
		deliverPizza();
	}
	public abstract void getMoney();
	public abstract void deliverPizza();
}

class ChennaiDomino extends Dominos{
	@Override
	public void deliverPizza() {
		System.out.println("using scooter to deliver pizza");
	}
	@Override
	public void getMoney() {
		System.out.println("accept money in rupees..");
	}
}
class KyivDominos extends Dominos{
	@Override
	public void deliverPizza() {
		System.out.println("deliver in army tank...");
	}
	@Override
	public void getMoney() {
		System.out.println("odip poo.....");
	}
}