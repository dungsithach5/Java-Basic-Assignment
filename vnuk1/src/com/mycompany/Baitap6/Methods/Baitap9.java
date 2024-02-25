package com.mycompany.Baitap6.Methods;

import java.util.Scanner;

//Nhập số nguyên n. Viết hàm tính tổng các chữ số của số nguyên dương n

public class Baitap9 {
	public static int tong(int n) {
		int S = 0;
        int i = 0;
       do {
            S += n % 10;
            n /= 10;
            i++;
        }while(n > 0);
       return S;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(" S = " + tong(n));
	}
}
