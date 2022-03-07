package day2;
//https://fluvid.com/videos/detail/dagdEhd2mAcABo8zP#.YhsqoUXgjwI.link
public class LoopsDemo2 {
	public static void main(String[] args) {
//		for(;;) {
//			System.out.println("infinite loopppp........");
//		}
		
//		for(int i=0;i<10;i++) {
//			System.out.println("i value...............:"+i);
//		}
		
		//nested for loop
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print("* \t");
			}
			System.out.println();
		}
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("* \t");
			}
			System.out.println();
		}
		
		for(int i=10;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("* \t");
			}
			System.out.println();
		}
		
		int a[]= {10,12,34,56,78};
		System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		for(int n:a) {
			System.out.println(n);
		}
		
		int arr2[][]= {
				{12,23,34,45,56},
				{45,67,87,5,67},
				{1,6,9,12,34}
		};
		
		for(int i=0;i<arr2.length;i++) {//no of rows
			for(int j=0;j<arr2[i].length;j++) {//no of columns of that particular row
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
		
		for(int i[]:arr2) {
			for(int j:i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}
