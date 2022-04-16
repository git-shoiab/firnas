package day3;
//https://fluvid.com/videos/detail/j-mdETrOQ-t5q5RKk#.YlpqzsI9i0c.link
public class Revision3 {
	public static void main(String[] args) {
		new OverLoadDemo().met(10L);
	}
}

class OverLoadDemo{
	public void met(int i) {
		System.out.println("int method called...");
	}
	
	public void met(long l) {
		System.out.println("long method called...");
	}
}