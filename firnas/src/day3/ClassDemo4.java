package day3;
//https://fluvid.com/videos/detail/G6x-YcD3VOu5g7rmY#.Yiw6ixPejrY.link
public class ClassDemo4 {
	public static void main(String[] args) {
		ClassDemo4 obj=new ClassDemo4();
		obj.met();
		obj.met(10);
		obj.met("hello");
		obj.met(10,"hai");
		obj.met("helllllllllllllooooooooooo",1010);
		obj.met(new Cat());
		obj.met(new Dog());
	}
	
	//overloading
	void met() {
		System.out.println("met called....");
	}
	void met(int i) {
		System.out.println("met with param called...:"+i);
	}
	void met(String s) {
		System.out.println("met called.."+s);
	}
	void met(int i,String s) {
		System.out.println("met called...:"+i+"....."+s);
	}
	void met(String s,int i) {
		System.out.println("met called...:"+s+"..."+i);
	}
	Cat met(Dog dog) {
		System.out.println(dog);
		return new Cat();
	}
	void met(Cat cat) {
		System.out.println(cat);
	}
	int met(float f) {
		return 200;
	}
	
}

class Dog{}
class Cat{}