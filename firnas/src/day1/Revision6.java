package day1;
//https://fluvid.com/videos/detail/aQadEULnaos3X9KrV#.YlEsJX772WM.link
public class Revision6 {
	public static void main(String[] args) {
		String s="hello world";//this will create one object in memory
		String st=new String("hello world");//this will create two objects in memory
		
		//String objects are non mutable
		String temp=s;
		
		s=s+"hai";
		System.out.println(s);
		System.out.println(temp);
		
		//string comparison
		
		System.out.println(temp==st);//this will compare objects
		System.out.println(temp.equals(st));//this will compare values
		
		System.out.println(st.substring(2));
		System.out.println(st.substring(2, 7));
		
		System.out.println(st.charAt(2));
		
		System.out.println(st.indexOf('w'));
		
		//StringBuffer sb=new StringBuffer("hello world");
		StringBuilder sb=new StringBuilder("hello world");
		//StringBuffer tempb=sb;
		StringBuilder tempb=sb;
		sb.append("hai");
		
		System.out.println(sb);
		System.out.println(tempb);
	}
}
