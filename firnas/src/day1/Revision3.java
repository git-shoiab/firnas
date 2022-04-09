package day1;
//https://fluvid.com/videos/detail/ykZL6c7gyLiEDkRY-#.YlEd9KwYhpo.link
import java.util.Vector;

public class Revision3 {
	public static void main(String[] args) {
		int i=10;
		Integer ii=i;//auto boxing
		
		i=ii;//auto unboxing
		
		Vector v=new Vector();
		v.add(i);//auto boxing
	}
}
