package day1;
//https://fluvid.com/videos/detail/Ee1-6HDqBkuQYQE9d#.YlpVSSnQSJo.link
public class Revision8 {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};//single dimensional array
		System.out.println("Length of array....:"+a.length);//this will return number of columns
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//enhanced for loop
		
		for(int n:a) {
			System.out.println("....."+n);
			
		}
		
		int twod[][]= {
				{10,20,30,40},
				{100,200,300,400},
				{1000,2000,3000,4000}
		};
		
		System.out.println(twod.length);//no of rows...
		System.out.println(twod[1].length);//returns no of columns in a row
		
		for(int i=0;i<twod.length;i++) {//will loop around the rows...
			for(int j=0;j<twod[i].length;j++) {//will loop around the columns of a row
				System.out.print(twod[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("......................................");
		for(int i[]:twod) {
			for(int j:i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}
