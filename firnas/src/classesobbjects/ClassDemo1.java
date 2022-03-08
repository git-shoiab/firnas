package classesobbjects;
//methods and object creation
//https://fluvid.com/videos/detail/P5OY2TPA5pcgrxGwP#.YicLyQ0sbJ4.link
public class ClassDemo1 {
	public static void main(String[] args) {
		ClassDemo1 obj=new ClassDemo1();//I am creating a object and assigning it
		ClassDemo1 obj2;//I am declaring a variable of type ClassDemo1
		
		Human shoiab;//my parent have declared a name called shoiab of type Human
		
		shoiab=new Human();//a human is pointed by shoiab reference or name
		
		obj.met();
		String result=obj.met2(10);
		System.out.println(result);
		Fridge samsung=new Fridge();
		samsung.cooling();
	}
	void met() {
		System.out.println("met called.....");
	}
	
	String met2(int n) {
		System.out.println("met 2 called.....");
		if(n==10) {
			return "100";
		}
		else {
			return "200";
		}
		
	}
}
class Human{}
class Fridge{	
	void cooling() {
		System.out.println("coolig method called...");
	}
}