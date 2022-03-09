package classesobbjects;
//method over loading...
//https://fluvid.com/videos/detail/DrG-KszX_YF-1X4jM#.YicZEJ2QTwM.link
public class ClassDemo4 {
	public static void main(String[] args) {
		ClassDemo4 obj=new ClassDemo4();
		obj.met();
		obj.met(3);
		
		Boy friend=new Boy();
		Girl unknown=new Girl();
		
		obj.help(unknown);
		obj.met(12,34,56,78,89);
	}
	
	void met() {
		System.out.println("met called...");
	}
	
	void met(int i) {
		System.out.println("met called.....:"+i);
	}
	
	void market(int money,String bag) {
		
	}
	
	void market(String bag,int money) {
		
	}
	
	void met(int... i) {//varargs
		
	}
//DYNAMIC POLYMORPHISM - RUNTIME POLYMORPHISM
//	void help(Boy boy) {
//		System.out.println("helping....:"+boy);
//	}
//	
//	void help(Girl girl) {
//		System.out.println("helping....:"+girl);
//	}
	
//STATIC POLYMORPHISM	
	void help(Object obj) {
		if(obj instanceof Boy) {
			System.out.println("helping the boy....");
		}
		else if(obj instanceof Girl) {
			System.out.println("helping the girl....");
		}
	}
}

class Boy{
	
}

class Girl{
	
}
