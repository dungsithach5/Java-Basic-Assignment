package com.mycompany.Baitap6.Methods;

public class DEMO3 {
	static boolean isSquareNumber(int n) {
		int square = (int)Math.sqrt(n);
		return n == square*square;
	}
	
	static void printSquareNumber(int n) {
		int count = 0;
		System.out.print("Square number: ");
		for(int i = 1; i <= n; i++) {
			if (isSquareNumber(i)) {
				count++;
				System.out.println(i + " ")
			}
		}
	}

}
