package oops;

public class AbstractDemo {
	public static void main(String[] args) {
		Dominos dominos=new KhaderDominos();
		dominos.templateMethod();
	}
}


abstract class Dominos{
	public final void pizzaBase() {
		System.out.println("dominos logic of pizza base...");
	}
	public final void addIngredients() {
		System.out.println("dominos ingredients....");
	}
	public final void bakePizza() {
		System.out.println("dominos way of baking pizza");
	}
	public final void pizzaBox() {
		System.out.println("dominos way of packing..");
	}
	public final void shopDecoration() {
		System.out.println("dominos shop decoration standard");
	}
	public final void templateMethod() {
		getMoney();
		pizzaBase();
		addIngredients();
		bakePizza();
		pizzaBox();
		deliverPizza();
	}
	public abstract void deliverPizza();
	public abstract void getMoney();
}

class KhaderDominos extends Dominos{
	@Override
	public void deliverPizza() {
		System.out.println("khader deliver pizza via boys in bike....");
	}
	@Override
	public void getMoney() {
		System.out.println("khader collects money in rupees....");
	}
}