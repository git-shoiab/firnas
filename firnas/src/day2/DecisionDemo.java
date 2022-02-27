package day2;
//https://fluvid.com/videos/detail/e-KdETVmxyF5dP5wz#.YhshkU62oqo.link
import java.util.Scanner;

public class DecisionDemo {
	public static void main(String[] args) {
		boolean result=false;
		if(result) {
			System.out.println("yes done....................");
		}
		else {
			System.out.println("yes not done............");
		}
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your day......:");
		String day=scan.next();
		
		
		if(day.equals("monday")) {
			System.out.println("solomon grandy born on monday...");
		}
		else if(day.equals("tuesday")) {
			System.out.println("married on tuesday.....");
		}
		else if(day.equals("wenesday")) {
			System.out.println("died on wednesday........");
		}
		else {
			System.out.println("bla bla bla bla.........");
		}
		
		System.out.println("Enter a number....:");
		int n=scan.nextInt();
		
		if(n%2==0) {
			System.out.println("Even number............");
		}
		else {
			System.out.println("odd number............");
		}
		
		//? - ternary operator
		String s=(n%2!=0)?"Even number...":"Odd number...";
		System.out.println(s);
		
		
		
	}
}
