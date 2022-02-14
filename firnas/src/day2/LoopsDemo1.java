package day2;

public class LoopsDemo1 {
	public static void main(String[] args) {
//		while(true) {//pre condition check
//			System.out.println("infinite loop");
//		}
		
//		do {
//			System.out.println("infinite");
//		}while(true);//post condition check
		
		int n=10;
		
		while(n<10) {
			System.out.println("pre ");
		}
		
		do {
			System.out.println("runs atleast once...");
		}while(n<10);
		
		do {
			System.out.println("runs atleast once..."+n);
			n--;
		}while(n>0);
		
		
	}
}
