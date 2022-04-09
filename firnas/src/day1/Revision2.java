package day1;
//https://fluvid.com/videos/detail/dagdEhZvABT8OyVvE#.YlEZW03Gb84.link
public class Revision2 {
	public static void main(String[] args) {
		int i=10;//primitive type
		Integer ii=10;//complex type
		
		System.out.println(ii.compareTo(5));
		
		double d=ii.doubleValue();
		
		System.out.println(d);
		
		System.out.println(ii.MAX_VALUE);
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		ii=Integer.valueOf(20);
		ii=i;//auto boxing
		i=ii;//auto unboxing
		i=ii.intValue();//unboxing
		
		String n1="100";
		String n2="200";
		//Integer.parseInt("20");
		System.out.println(n1+n2);
		
		System.out.println(Integer.parseInt(n1)+Integer.parseInt(n2));
		
	}
}
