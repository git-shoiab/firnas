package day2;
//https://fluvid.com/videos/detail/dagdEhd2mAcABo8zP#.YhsqoUXgjwI.link
public class DecisionDemo2 {
	public static void main(String[] args) {
		int n=2;
		switch(n) {
		default:{
			System.out.println("default............");
			break;
		}
		case 1:{
			System.out.println("sunday...........");
			break;
		}
		case 2:{
			System.out.println("monday...............");
			break;
		}
		case 3:{
			System.out.println("tuesday......");
			//break;
		}
		}
		
		char a='m';
		switch(a) {
		default:{
			System.out.println("default............");
			break;
		}
		case 'm':{
			System.out.println("sunday...........");
			break;
		}
		case 'n':{
			System.out.println("monday...............");
			break;
		}
		case 'y':{
			System.out.println("tuesday......");
			//break;
		}
		}
		
		String str="hello";
		switch(str) {
		default:{
			System.out.println("default............");
			break;
		}
		case "hai":{
			System.out.println("sunday...........");
			break;
		}
		case "hello":{
			System.out.println("monday...............");
			break;
		}
		case "bai":{
			System.out.println("tuesday......");
			//break;
		}
		}
	}
}
