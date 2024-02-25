package com.mycompany.Baitap8.WorkingwithsomeReferenceDataTypes;

import java.util.Scanner;

//Nhập vào chuỗi String chứa số nguyên. Chuyển thành số nguyên và in ra màn hình

public class WrapperClass1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n = ");
		String s = sc.nextLine();
		int i = Integer.parseInt(s);
		System.out.println(s + 50);
		
		System.out.println(i + 50);
	}
}
