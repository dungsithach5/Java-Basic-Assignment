package com.mycompany.Baitap6.Methods;

public class DEMO {
	public static int add(int a , int b) {
		return a + b;
	}
	
	public static void print() {
		System.out.println("Hello, I am a Programmer !!");
	}
	
	public static void main(String[] args) {
		print();
		
		int a = 10;
		int b = 20;
		int sum = add(a, b);
		System.out.println("sum = " + sum);
	}

}
