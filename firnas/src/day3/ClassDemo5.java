package day3;
//https://fluvid.com/videos/detail/2_nw1SOnGpCMg5Qpn#.YixDagSojRA.link
public class ClassDemo5 {
	int i;
	protected ClassDemo5(int i) {
		this.i=i;
	}
	
	String s;
	
	ClassDemo5(String s){
		this.s=s;
	}
	public static void main(String[] args) {
		String value=args[0];
		ClassDemo5 obj=new ClassDemo5(value);
		obj.met();
	}
	void met() {
		System.out.println(s);
	}
}
