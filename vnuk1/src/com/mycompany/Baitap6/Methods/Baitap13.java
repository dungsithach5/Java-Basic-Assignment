package com.mycompany.Baitap6.Methods;

import java.util.Scanner;

//Nhập số nguyên n. Viết hàm tìm chữ số nhỏ nhất của số nguyên dương n (n > 0)

public class Baitap13 {
	public static int Minchuso(int n) {
		int min = 1;
        int i = n % 10;
        
//        max = n % 10;
        do {
            if(min > i) {
                min = i;
            }
            i = n % 10;
            n /= 10;
        }while(n != 0);
        return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Min = " + Minchuso(n));
	}
}
