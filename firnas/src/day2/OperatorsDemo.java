package day2;

public class OperatorsDemo {
	public static void main(String[] args) {
		int i=11;
		int j=3;
		
		//Addition
		int add=i+j;
		System.out.println("Addition..:"+add);
		
		//subtraction
		int sub=i-j;
		System.out.println("subtraction..:"+sub);
		
		
		//multiplication
		int mul=i*j;
		System.out.println("multiplication..:"+mul);
		
		//Addition
		int div=i/j;
		System.out.println("division-quotient..:"+div);
		
		//mod
		int mod=i%j;
		System.out.println("mod-reminder..:"+mod);
		
		//INCREMENT OR DECREMENT
		
		int n=10;
		//n++;//or n=n+1;
		System.out.println(n++);//post increment - prints first and then increments - 10
		System.out.println(n);//11
		
		n=10;
		//n++;//or n=n+1;
		System.out.println(++n);//pre increment - increments first and then prints -11
		System.out.println(n); // - 11
		
		n=10;
		//n--;//or n=n-1;
		System.out.println(n--);//post decrement - prints first and then decrements - 10
		System.out.println(n);//9
		
		n=10;
		//n++;//or n=n+1;
		System.out.println(--n);//pre decrement - decrements first and then prints -9
		System.out.println(n); // - 9
		
		n=10;
		//n=n+3;
		n+=3;
		System.out.println(n);
		
		n=10;
		//n=n-7;
		n-=7;
		System.out.println(n);
		
		n=10;
		//n=n*3;
		n*=3;
		System.out.println(n);
		
		n=10;
		//n=n/3;
		n/=3;
		System.out.println(n);
		
		n=10;
		//n=n%3;
		n%=3;
		System.out.println(n);
		
		
	}
}
