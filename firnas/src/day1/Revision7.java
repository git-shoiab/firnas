package day1;

import java.util.Scanner;
//https://fluvid.com/videos/detail/Ee1-6HDqBkuQYQE9d#.YlpVSSnQSJo.link
public class Revision7 {
	public static void main(String[] args) {
		/*
		 * 1. Condition - if, switch, ternary
		 * 2. Loops - for, enhanced for , while, dowhile
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number..:");
		int i=scan.nextInt();
		System.out.println(i==10);
		if(i==10) {			
			System.out.println("i value is 10");
		}
		else if(i==20) {
			System.out.println("i value is 20");
		}
		else {
			System.out.println("value other than 10");
		}
		boolean boo=true;
		if(boo) {
			
		}
		//ternary operator - ?
		
		String s=(i==10)? "i is of value ten":"its not of value 10";
		System.out.println(s);
		
		//switch case
		switch(i) {
		default:{
			System.out.println("unknown value....................");
			break;
		}
		case 10:{
			System.out.println("the value of i is ten..................");
			break;
		}
		case 20:{
			System.out.println("the value of i is twenty..............");
		}
		
		}
		char c='a';
		switch(c) {
		case 'a':{}
		}
		
		String str="hello";
		switch(str) {
		case "hello":{}
		}
		
		//Loops
		
//		while(true) {//infinite loop
//			System.out.println("loop called...");
//		}
		
		int num=10;
		while(num>0) {
			System.out.println(num);
			num--;
		}
		
		do {
			System.out.println(num);
			num++;
		}while(num<10);
		
		
//		for(;;) {//infinite loop
//			
//		}
		for(int k=0;k<10;k++) {
			System.out.println("..."+k);
		}
	}
}
