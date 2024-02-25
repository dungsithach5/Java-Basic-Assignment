package com.mycompany.Baitap6.Methods;

import java.util.Scanner;

// Nhập số nguyên n. Viết hàm tìm số đảo ngược của số nguyên dương n (n > 0)

public class Baitap11 {
	public static int Sodaonguoc(int n) {
		int temp = 0;
		do {
            temp = temp * 10 + n % 10;
            n /= 10;
        }while (n > 0);
		return temp;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("So dao nguoc cua " + n +" la = " + Sodaonguoc(n));
	}
}
