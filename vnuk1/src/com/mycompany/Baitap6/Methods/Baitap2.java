package com.mycompany.Baitap6.Methods;

import java.util.Scanner;

//Nhập số nguyên n (0 < n <= 10). Viêt hàm tính S = 1 + 1.2 + 1.2.3 + 1.2.3.4 + … + 1.2.3...n

public class Baitap2 {
	 public static int tong(int a) {
		 int S = 1;
		 for(int i = 1 ; i <= a ; i++) {
			 S  *= i;
		 }
		 return S;
	 }
	 
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int S = 0;
		 for(int i = 1 ; i <= n ; i++) {
			 S += tong(i);
		 }
		 System.out.print("S = " + S);
	 }
}
