package com.mycompany.Baitap6.Methods;
//Nhập số nguyên n. Viết hàm kiểm tra số nguyên dương n có toàn chữ số chẵn hay khôn

import java.util.Scanner;

public class Baitap15 {
	static boolean isALLOddElements(int n) {
		while(n != 0) {
			int tmp = n % 10;
			if(tmp % 2 != 0) {
				return false;
			}
			n /= 10;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isALLOddElements(n));
	}
}
