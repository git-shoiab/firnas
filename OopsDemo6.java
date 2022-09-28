package oops;

public class OopsDemo6 {
	public static void main(String[] args) {
		SubClass obj=new SubClass();
		obj.display(12);
		System.out.println(obj.i);
		
		Employee emp=new Sweeper();
		emp.work();
		
			
	}
}
//the subclass will have all the properties and methods of superclass
class SubClass extends SuperClass{
	public SubClass() {
		super("bbla bla bla",56);
		System.out.println("sub class cons called.....");
	}
	
	int i=20;
	public void display(int i) {
		System.out.println("this is child class method called...:"+i);
	}
}


class SuperClass{
//	public SuperClass() {
//		System.out.println("super class cons called...");
//	}
	public SuperClass(String s,int i) {
		System.out.println("sub class cons with string called....");
	}
	int i=10;
	public void display(int i) {
		System.out.println(i);
	}
}

class Employee{
	public void work() {
		System.out.println("employee working...");
	}
}

class Engineer extends Employee{
	public void work() {
		System.out.println("planning planning planning..");
	}
	public void engineerWork() {
		
	}
}
class Sweeper extends Employee{
	public void work() {
		System.out.println("sweeping sweeping..........");
	}
}

