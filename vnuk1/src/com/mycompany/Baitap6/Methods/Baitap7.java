package com.mycompany.Baitap6.Methods;

import java.util.Scanner;

public class Baitap7 {
	public static void Sochinhphuong(int n) {
		
        int i = (int)(Math.sqrt(n));
        if(i*i == n) { // số binh phương = căn bặc 2 là số nguyên
            System.out.println("true");
        }else{
            System.out.println("false");
        }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		Sochinhphuong(n);
	}
}
