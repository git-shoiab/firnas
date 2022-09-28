package oops;
/*
 * Inheritance lead to specialization
 * Inheritance lead to reusability of objects
 * 
 * Inheritance 3 golden rules.
 * a. Parent class cannot replace the child class
 * b. Child class can replace the parent class, but 
 * only the parent class properties will be visible
 * c. Child class can replace the child class, in such a case
 * all the properties of parent and child are visible
 */
public class OopsDemo7 {
	public static void main(String[] args) {
		PartyHall hall=new PartyHall();
		hall.eat();
		hall.dance();
		
		//PartyHall haa=new Hall();
	}
}

class Hall{
	public void eat() {
		System.out.println("eat eat eat..");
	}
}

class PartyHall extends Hall{
	public void dance() {
		System.out.println("dance dance dance....");
	}
}

class PoojaHall extends Hall{
	
}

class TrainingHall extends Hall{
	
}