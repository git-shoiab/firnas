package classesobbjects;
//https://fluvid.com/videos/detail/AZX-wTBkLnUm_G-wo#.YiMKXZOpg7Y.link
public class ArrayDemo2 {
	public static void main(String[] args) {
		//two dimensional array
		
		int arr[][]= {
				{23,45,67,78},
				{23,45,67,89},
				{12,23,34,56}
		};
		int rows=3;
		int cols=4;
		int twod[][]=new int[rows][cols];
		
		System.out.println(arr.length);//no of rows
		System.out.println(arr[0].length);//no of rows of the zeroth row
		
		//assign values
		
		arr[1][2]=670;
		arr[2][2]=340;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("........................................");
		for(int i[]:arr) {
			for(int j:i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}
