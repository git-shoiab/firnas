package classesobbjects;

public class ClassDemo6 {
	public static void main(String[] args) {
		Laddu laddu=new Laddu();
		ClassDemo6 obj=new ClassDemo6();
		System.out.println("laddu size..before passing:"+laddu.size);
		obj.pbv(laddu.size);//passing value - copy will be passed..
		System.out.println("laddu size after passing..:"+laddu.size);
		
		System.out.println("pass by reference...");
		
		System.out.println("laddu size before passing-ref:"+laddu.size);
		obj.pbr(laddu);//passing reference - original object is getting passed...
		System.out.println("laddu size after passing-ref:"+laddu.size);
	}
	
	void pbv(int size) {
		size=5;
	}
	
	void pbr(Laddu myladdu) {
		myladdu.size=5;
	}
}


class Laddu{
	int size=10;
}