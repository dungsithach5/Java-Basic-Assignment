package com.mycompany.Baitap8.WorkingwithsomeReferenceDataTypes;

import java.util.Scanner;
//Nhập 1 chuỗi bất kì. Đếm xem có bao nhiêu từ

public class CharacterString11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input String : ");
		String str = sc.nextLine();
		
		int count = 0;
		for(int i = 0 ; i < str.length(); i++) {
			count++;
		}
		System.out.println(count + "ky tu");
	}
}
