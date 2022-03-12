package day3;
//https://fluvid.com/videos/detail/ykZL6ckjXgfY9Q2w6#.YiwxJMZv9Bg.link
public class ClassDemo2 {
	public static void main(String[] args) {
		ClassDemo2 obj=new ClassDemo2();
		obj.met();
		
		Car car=new Car();
		car.filterPetrol();
		
		car.drive(100);//drive method is called with argument 100
		car.lights("aaa","ffff",20);
		car.seating(new Seat(),new Seat());
		car.otherSeating(new Seat(),new Seat(),new Seat(),new Seat());
		
	}
	void met() {
		System.out.println("method met called....");
	}
}

class Car{
	void filterPetrol() {
		System.out.println("filter petrol method working...");
	}
	
	void drive(int speed) {//declared a method with speed parameter of type int
		System.out.println("drive method called...:"+speed);
	}
	void lights(String frontlight,String backlight,int power) {
		
	}
	void seating(Seat frontseat,Seat backseat) {//complex type as parameter
		
	}
	
	void otherSeating(Seat... s) {//varargs - jdk5
		
	}
}

class Seat{
	
}