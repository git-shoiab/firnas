package oops;

public class OopsDemo1 {
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		System.out.println("The sum of 10 and 20 is..:"+obj.add(10,20));
		
		obj.add2(40,50);
		
		Calculator obj2=new Calculator();
		obj2.displayResult();
		
		Calculator obj3=new Calculator();
		obj3.displayResult();
	}
}

class Calculator{
	int result=0;//instance variable - global variable of the object
	
	static int result2;//class variable - global variable of the class
	public int add(int i,int j) {
		int sum=i+j;
		return sum;
	}
	
	public void add2(int i,int j) {//the int i and j are local variable
		result=i+j;
		result2=i+j;
	}
	
	public void displayResult() {
		System.out.println("The result is..:"+result);
		System.out.println("The result is.....................static......:"+result2);
	}
}
