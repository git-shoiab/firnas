package firnas;
//Congragulations...good example...
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a number...:");
		int num1=scan.nextInt();//INPUT
		
		System.out.println("Please enter another number....:");
		int num2=scan.nextInt();//INPUT
		
		int sum=num1+num2;//PROCESS
		
		System.out.println("Addition of two numbers is...:"+sum);//OUTPUT
	}
}
