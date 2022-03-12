package day3;
//https://fluvid.com/videos/detail/ykZL6ckjXqtY9QOa7#.Yiw3yhPM8uk.link
public class ClassDemo3 {
	public static void main(String[] args) {
		ClassDemo3 obj=new ClassDemo3();
		int n=obj.getAge();
		System.out.println(n);
		
		System.out.println(obj.getName(300));
	}
	
	int getAge() {
		return 10;
	}
	
	String getName(int rollno) {
		switch(rollno){
		case 100:{
			return "abdul";
			//break;
		}
		case 200:{
			return "mohit";
			//break;
		}
		default:{
			return "unknown";
		}
		}
	}
}
