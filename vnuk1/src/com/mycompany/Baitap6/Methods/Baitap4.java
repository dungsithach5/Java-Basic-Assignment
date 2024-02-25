package com.mycompany.Baitap6.Methods;

import java.util.Scanner;

//Viết hàm đếm số lượng “ước số” của số nguyên dương n (n > 0)

public class Baitap4 {
	public static int dem(int n) {
	        int count = 0; // count: đếm
	        for(int i = 1 ; i <= n ; i++) {
	            if(n % i == 0){
	                count++;// important
	            }
	        }
	        return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Dem = " + dem(n));
	}
}
