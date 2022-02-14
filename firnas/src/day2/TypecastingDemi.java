package day2;

public class TypecastingDemi {
	public static void main(String[] args) {
		int n=10;//32 bit
		//byte b= n;//higher type cannot go into lower type
		long ll=n;
		
		byte bb=20;//lower type can fit in higher type
		n=bb;//auto type promotion
		
		float f=90;
		f=n;//float can accept integer
	//	n=f;//int cannot accept float
		
		char c='a';
		n=c;
	//	c=n;//int is 32 bit but char is 16 bit
		
		
		//boolean is not compatible with any thing
		String s="23";
		//n=s;
		n=Integer.parseInt(s);
		
		byte n1=10;
		byte n2=2;
		
		int result=n1*n2;//the arithmetic operation will always return a int - auto type promotion
		
		n=258;
		System.out.println(n%256);
		bb=(byte)n;//type casting - it will covert int to byte forcefully - u loose precision
		
		System.out.println(bb);
		
		f=89.67f;
		n=(int)f;
		System.out.println(n);
		
		c=(char)n;// 
	}
}
