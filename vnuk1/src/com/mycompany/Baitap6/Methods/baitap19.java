package com.mycompany.Baitap6.Methods;

import java.util.Scanner;

//Liệt kê tất cả các số chính phương nhỏ hơn n(Sử dụng hàm kiểm tra số chính phương
public class baitap19 {
	public static int SoChinhPhuong(int n) {
        for(int i = 1 ; i <= Math.sqrt(n) ; i++) {
        	System.out.print(i + " ");
        	
        }
        return n;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		System.out.printf("Liet ke cac so chinh phuong %d nho hon n la :\n" , n);
		System.out.print(SoChinhPhuong(n));
	}
}
