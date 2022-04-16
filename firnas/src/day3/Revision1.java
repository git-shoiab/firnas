package day3;

public class Revision1 {
	public static void main(String[] args) {
		int i=10;//primitive type
		String s=new String("aa");//still this is a primitive type
		Cycle bsa=new Cycle();//complex type
		String re=bsa.pedal(2);
		System.out.println(re);
	}
}

//methods
//complex types
//Relationships
//method overloading
//method overriding

class Cycle{
	String type="sports type";
	
	public void wheelRotation() {
		
	}
	public void gearChange() {
		
	}
	
	public String pedal(int n) {
		if(n==1) {
			return "speed";
		}
		else if(n==2) {
			return "high speed";
		}
		else {
			return "no speed";
		}
	}
}