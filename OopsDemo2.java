package oops;

public class OopsDemo2 {
	public static void main(String[] args) {
		ClassRoom sharukhkhan=new ClassRoom();
		ClassRoom amirkhan=new ClassRoom();
		ClassRoom salmankhan=new ClassRoom();
	}
}


class ClassRoom{
	Projector sanyo=new Projector();//creating a variable of complex type
	static Toilet sulab=new Toilet();//CLASS VARIABLE - FOR ANY NUMBER OF INSTANCES OF CLASSROOM CLASS, ONLY ONE TOILET OBJECT IS CREATED
	Human shoiab=new Human();
}

class Projector{
	public Projector() {
		System.out.println("projector object created...");		
	}
}

class Toilet{
	public Toilet() {
		System.out.println("Toilet object created...");
	}
}

class Human{}