package day3;
//https://fluvid.com/videos/detail/j-mdETrOQ-t5q5RKk#.YlpqzsI9i0c.link
public class Revision2 {
	public static void main(String[] args) {
		Friend friend=new Friend();
		Nallavan newcollege=new Nallavan();
		newcollege.help(new Virothi());
	}
}

class Nallavan{
	//virtual method invocation or dynamic method invocation
	public void help(Friend friend) {
		System.out.println("kandippa help pannuvom.........");
	}
	public void help(GirlFriend gf) {
		System.out.println(":)))))))))))))))))))))))))))))))))))))))");
	}
	public void help(Virothi v) {
		System.out.println(":(((((((((((((((((((((((((((");
	}
	
}

class Friend{
	
}
class GirlFriend{
	
}
class Virothi{
	
}