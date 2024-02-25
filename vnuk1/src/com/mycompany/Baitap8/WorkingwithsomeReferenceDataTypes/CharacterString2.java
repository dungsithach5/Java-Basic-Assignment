package com.mycompany.Baitap8.WorkingwithsomeReferenceDataTypes;
//Nhập vào một chuỗi. In ra màn hình chuỗi in hoa bằng 2 cách


//Sử dụng hàm có sẵn   dung ma ASCII
//Không sử dụng hàm có sẵn dung  ma ASCII

import java.util.Scanner;

public class CharacterString2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("Input String: ");
		str = sc.nextLine();
		
		String newStr = "";
		for(int i = 0 ; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isLowerCase(ch)) {
				newStr += (char)('A' - 62);
			}else {
				newStr += ch;
			}
		}
		System.out.println(newStr);
	}
}
