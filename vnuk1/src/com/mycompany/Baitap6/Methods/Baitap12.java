package com.mycompany.Baitap6.Methods;

import java.util.Scanner;

// Nhập số nguyên n. Viết hàm tìm chữ số lớn nhất của số nguyên dương n (n > 0)

public class Baitap12 {
	public static int Maxchuso(int n) {
		int max = 0;
        int i = n % 10;
        
//        max = n % 10;
        do {
            if(max < i) {
                max = i;
            }
            i = n % 10;
            n /= 10;
        }while(n != 0);
        return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Max = " + Maxchuso(n));
	}
}
