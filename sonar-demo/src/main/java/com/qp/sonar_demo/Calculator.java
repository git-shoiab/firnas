package com.qp.sonar_demo;

public class Calculator {
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		int result=calc.add(10,10);
		System.out.println(result);
	}
	public int add(int i,int j) {
		return i+j;
	}
	public int mul(int i,int j) {
		return i*j;
	}
}
