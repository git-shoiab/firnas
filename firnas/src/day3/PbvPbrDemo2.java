package day3;

public class PbvPbrDemo2 {
	public static void main(String[] args) {
		int arr[]= {12,3,4,66};
		System.out.println(arr[0]);
	//	pbr(arr);
	//	System.out.println(arr[0]);
		
		int arr2[]=new int[4];
		System.arraycopy(arr, 0, arr2, 0, 4);
		pbv(arr2);
		System.out.println(arr[0]);
	}
	
	static void pbr(int i[]){
		i[0]=20;
	}
	
	static void pbv(int i[]) {
		i[0]=30;
	}
}
