package classesobbjects;
//https://fluvid.com/videos/detail/R_4m9SveOOuMpEkYP#.YicQlQHRGCo.link
public class ClassDemo3 {
	public ClassDemo3() {
		System.out.println("cons called...");
	}
	
	static {
		System.out.println("static block called..");
	}
	
	public static void main(String[] args) {
//	ClassDemo3 obj=new ClassDemo3();
//	obj.met();
	
	ClassDemo3.met();
	System.out.println(ClassDemo3.met2());
}

static void met() {
	System.out.println("static met called...");
}

static int met2() {
	System.out.println("static met2 called...");
	return 100;
}
}
