package com.mycompany.Baitap6.Methods;

import java.util.Scanner;

//Tính tổng tất cả các “ước số” của số nguyên dương n (n 

public class Baitap3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
		System.out.print("S = " + tong(b));
	}
	
	public static int tong(int n) {
        int S = 0;
        
        for (int i = 1 ; i <= n ; i++) {
            if (n % i == 0) {
                S += i;
            }
        }
        return S;
	}
}
