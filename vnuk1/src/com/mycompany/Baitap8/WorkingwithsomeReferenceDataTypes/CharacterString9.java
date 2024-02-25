package com.mycompany.Baitap8.WorkingwithsomeReferenceDataTypes;
//Đổi các từ ở đầu câu sang chữ hoa và những từ không phải đầu câu sang chữ thường. 


import java.util.Scanner;

public class CharacterString9 {
	public static void main(String[] ars) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input String : ");
		String s = sc.nextLine();
		
		s = s.toLowerCase();
		
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
