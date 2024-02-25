package com.mycompany.Baitap8.WorkingwithsomeReferenceDataTypes;
//Nhập vào một chuỗi. In ra màn hình chuỗi:
//Đã loại bỏ hết tất cả các kí tự không thuộc a - z, A-Z và ký tự trắng  trong chuỗi đầu vào.
//Viết hoa ký tự đầu tiên của mỗi từ.
//Ví dụ:
//"a1b2c3d4 a1b2c3d4" ---> Output: Abcd Abcd

import java.util.Scanner;

public class CharacterString6 {
	public static void main(String[] ars) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input String : ");
		String s = sc.nextLine();
		
		for(char c = '0' ; c <= '9' ; c++) {
			s = s.replace(c + "" , "");
		}
		
		String newStr = "";
		for (int i = 0 ; i < s.length() ; i++) {
			char ch = s.charAt(i);
			if (i == 0 || Character.isWhitespace(s.charAt(i - 1))) {
				newStr += Character.toUpperCase(ch);
			} else {
				newStr += ch;
			}
		}
		System.out.print(newStr);
	}
}
