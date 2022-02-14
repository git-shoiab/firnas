package day2;

public class EscapeSequence {
	public static void main(String[] args) {
		System.out.println("hello \"firnas\" world");
		
		System.out.println("hello \'firnas\' world");
		
		System.out.println("hello \nfirnas \nworld");
		
		System.out.println("hello \tfirnas \tworld");
		
		System.out.println("hello \ttfirnas \t\t\tworld");
		
		System.out.println("hello \n\t\tfirnas \n\t\t\t\tworld");
		
		System.out.println("hello\b\b\bworld");
		
		System.out.println("hello  hello\r world");
		
		int count=0;
		while(true) {
			System.out.print(count++ +"\r");
		}
	}
}
