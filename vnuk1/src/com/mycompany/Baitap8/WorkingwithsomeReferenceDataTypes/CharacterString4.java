package com.mycompany.Baitap8.WorkingwithsomeReferenceDataTypes;

import java.util.Scanner;
//Nhập vào một chuỗi, Đếm ký tự và số xuất hiện trong một chuỗi
//Ví dụ: “Nam nay la nam 2017” → 11 ký tự và 4 số

public class CharacterString4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input String : ");
		String str = sc.nextLine();
		
		str = str.replaceAll(" ","");
		
		int countChar = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' ) {
				countChar++;
			}
		}
		
		int countNumber = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				countNumber++;
			}
		}
		System.out.print(countChar + "ky tu " + countNumber + "so");
	}
	
}
