package com.mycompany.Baitap6.Methods;

import java.util.Scanner;

// Nhập số nguyên n. Viết hàm đếm số lượng chữ số lẻ của số nguyên dương n (n > 0)

public class Baitap10 {
	public static int Demsole(int n) {
		int count = 0;
		while (n > 0) {
            int temp = n % 10;
            if (temp % 2 == 1) {
                count++;
            }
            n /= 10;
        }
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("dem so luong chu so le : " + Demsole(n));
	}
}
