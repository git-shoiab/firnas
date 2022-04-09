package day1;

public class Revision5 {
	public static void main(String[] args) {
		//arithmetic operations - +, -,*, /, %
		//logical operations - &, ||, !
		//relational operations - <, >,<=, >=, !=, ==
		
		int a=10;
		int b=2;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);//division - quotient
		System.out.println(a%b);//mod - reminder
		
		System.out.println(a==b);
		
		boolean boo=a<20 && a<b;//AND
		System.out.println(boo);
		
		boo=a<20 || a<b;//OR
		System.out.println(boo);
	}
}
