package day1;

public class VariableDemo2 {
	public static void main(String[] args) {
		//We should learn
		//1. How to accept numbers
		//2. How to accept characters
		//3. How to accept floating number (decimal numbers)
		//4. How to accept words and paragraphs
		//numbers
		
		//byte - 8bit, short - 16bit, int - 32 bit, long - 64bit
		byte b;//variable b of type byte is declared  - only declaration
		byte weight=120;//value 120 is assigned to variable weight of type byte - declaration with initialization
		
		//Range
		
		weight=127;
		weight=-128;
		
		//16 bit
		short s=32_7_67;
		s=-32768;
		
		//32 bit
		int i=2147483647;
		i=-2147483648;
		
		//64 bit
		long distance=9223372036854775807L;
		distance=-9223372036854775808L;
		
		//char is 16bit - 0 to 65535
		char c='a';//initialization of a char is always with single quotes
		c=97;//the ASCII (American standard code for information interchange_ of alpabet 'a'
		
		//c="a";//It will throw  a error
		//float - 32 bit
		float price=100;//float can accept non decimal values
		price=100.345F;//the previous value of 100 is overriden
		
		//64 bit
		double netprice=1221;
		netprice=324234.43;
		
		boolean accept=true;
			accept=false;
			
			//boolean can only accept true or false
		
	
		//words or scentenses or paragraphs - where you dont know the limit
			
			//complex type called String - (the above byte, short, int, long etc are primitive types)
			
			//Sting is also a class
			
	     //Thier is no range for string - string is unlimited.
			
			String str="Hello world";
	}
}
