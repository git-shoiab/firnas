package day1;

public class VariableDemo4 {
	public static void main(String[] args) {
		//simple types- byte, int, short, long, float, double, boolean, char
		//Complex types - String or a variable declared using a class
		
		String s="hello world";//this is widely used
		String st=new String("hello world");//this occupies more memory so we seldom use
		String str=String.valueOf("hello world");//this also widely used
		
		//int -Integer
		//char - Character
		//float - Float, byte - Byte, short- Short, double - Double, long - Long
		
		int i=10;//simple type (Primitive type)- only declaring value
		//complex type - occupies more memory, performance will take a back seat
		//wrapper class
		Integer ii=20;
		Integer iii=new Integer(20);
		Integer iiii=Integer.valueOf(20);
		
		char c='a';
		Character cc='a';
		Character ccc=new Character('a');
		Character cccc=Character.valueOf('a');
		
		int result=Integer.compare(20, 10);// I can use this method when I want identify which value is higher and which value is lower
		//one place is SORTING 
		
		System.out.println(result);
		
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Integer.max(10, 20));
		System.out.println(Integer.min(10, 20));
		
		String n1="100";
		String n2="200";
		
		System.out.println(n1+n2);//two string with + sign will end up with concatenation
		
		// so our requirement is to convert it to number
		
		int num1=Integer.parseInt(n1);//parseInt is a method which converts a string to number
		int num2=Integer.parseInt(n2);
		System.out.println(num1+num2);
		
		String s1="a";//97 - ascii value -  AMERICAN STANDARD CODE FOR INFORMATION INTERCHANGE
		String s2="b";//98 - ascii value
		str="My name isbilla...";
		System.out.println(s1.compareTo(s2));
		
		System.out.println(str.substring(3));
		
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf('M'));
		
		System.out.println(str.substring(4,10));//4- starting point and 10 is before end point
		
		str="hello";// this is value form based - primitive type
		String str2=new String("hello");//object based -complex type
		
		System.out.println(str==str2);//= assignemnt operator and == is comparison operator , == will compare the objects
		System.out.println(str.equals(str2));//equals method will compare the values inside..
	}
}

