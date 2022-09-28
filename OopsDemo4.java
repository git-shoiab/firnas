package oops;

public class OopsDemo4 {
	public static void main(String[] args) {
		Laddu myladdu=new Laddu();
		PassByValue pbv=new PassByValue();
		System.out.println("Before Pbv laddu size..:"+myladdu.size);
		pbv.pbv(myladdu.size);//a copy is passed
		System.out.println("After Pbv laddu size..:"+myladdu.size);
		
		PassByReference pbr=new PassByReference();
		System.out.println("Before Pbr laddu size..:"+myladdu.size);
		pbr.pbr(myladdu);//the actual address is passed
		System.out.println("After Pbr laddu size..:"+myladdu.size);
	}
}

class Laddu{
	int size=10;
}

class PassByValue{
	public void pbv(int size) {
		size=5;
	}
}

class PassByReference{
	public void pbr(Laddu laddu) {
		laddu.size=5;
	}
}
