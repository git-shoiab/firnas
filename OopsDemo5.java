package oops;

public class OopsDemo5 {
	public static void main(String[] args) {
		Service ser=new Service("aaa",10);
		ser.doService(new PoorMan());
		
		ser.add(100D, 200L);
	}
}

class Service{
	public Service() {
		System.out.println("default cons called...");
	}
	public Service(String s) {
		System.out.println("over loaded string cons called...");
	}
	public Service(String s,int i) {
		System.out.println("over loaded string cons and int i called...");
	}
	public void doService(RichMan rm) {
		System.out.println("richman do service method called...");
	}
	
	public void doService(PoorMan pm) {
		System.out.println("poor man do service method called...");
	}
	
	public void add(int i,int j) {
		System.out.println("int int method called");
	}
	public void add(double d,long l) {
		System.out.println("double long method called...");
	}
}

class RichMan{
	
}
class PoorMan{
	
}