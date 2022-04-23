package day3;

public class PbvPbrDemo {
	public static void main(String[] args) {
		Laddu laddu=new Laddu();
		System.out.println("size of laddu before pbv..:"+laddu.size);
		pbv(laddu.size);
		System.out.println(laddu.size);
		
		pbr(laddu);
		System.out.println(laddu.size);
	}
	
	static void pbv(int size) {
		size=5;
	}
	
	static void pbr(Laddu myladdu) {
		myladdu.size=5;
	}
}

class Laddu{
	int size=10;
}