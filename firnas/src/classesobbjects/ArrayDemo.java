package classesobbjects;
//https://fluvid.com/videos/detail/AZX-wTBkLnUm_G-wo#.YiMKXZOpg7Y.link
public class ArrayDemo {
	public static void main(String[] args) {
		//single dimensional
		//int []a=new int[5];//1 row and 5 columns
		int []a= {10,23,45,56,67};
		
		System.out.println("No of columns..:"+a.length);
		
		//assigning values
		a[0]=10;
		a[1]=20;
		
		//read
		System.out.println(a[0]);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("......................................");
		for(int i:a) {
			System.out.println(i);
		}
	}
}
