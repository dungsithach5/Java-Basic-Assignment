package com.mycompany.Baitap8.WorkingwithsomeReferenceDataTypes;

import java.util.Scanner;

//Nhập vào một chuỗi. Đổi những ký tự đầu tiên của mỗi từ thành chữ in hoa

public class CharacterString5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String newStr = "";
		for (int i = 0 ; i < str.length() ; i++) {
			char ch = str.charAt(i);
			if (i == 0 || Character.isWhitespace(str.charAt(i - 1))) {
				newStr += Character.toUpperCase(ch);
			} else {
				newStr += ch;
			}
		}
		System.out.print(newStr);
	}
}
