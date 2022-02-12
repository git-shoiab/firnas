package day1;

import java.util.Scanner;

public class VariableDemo1 {
	public static void main(String[] args) {
		//INPUT - PROCESS - OUTPUT
		
		//INPUT
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number...:");
		int num1=scan.nextInt();
		
		System.out.println("Please enter another number..:");
		int num2=scan.nextInt();
		
		//PROCESS
		int sum=num1+num2;
		
		//OUTPUT
		System.out.println("The Addtion is...:"+sum);
	}
}
