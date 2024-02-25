package com.mycompany.baitap5.overall;

import java.util.Scanner;

// Tìm số nguyên dương n nhỏ nhất sao cho 1 + 2 + … + n > 10000

public class Baitap34 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int S = 0;
	
	while (S < 10000) {
		n++;
		S += n;
	}
	System.out.println(" S = " + S);
	System.out.printf("Tong so nguyen duong n nho nhat sao cho n > 10000 la %d" , n);

	}
}
