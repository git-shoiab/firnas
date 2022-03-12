package classesobbjects;

public class ClassDemo7 {
	public static void main(String[] args) {
		int arr[]= {23,34,45,67};
		System.out.println("Before passing...:"+arr[1]);
		accept(arr);
		System.out.println("After passing...:"+arr[1]);
	}
	
	static void accept(int a[]) {
		a[1]=101010;
	}
	
	static void accept2(int i) {
		i=101010;
	}
}
