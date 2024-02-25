package com.mycompany.Baitap8.WorkingwithsomeReferenceDataTypes;

import java.util.Scanner;

//Nhập vào một chuỗi. In ra màn hình chuỗi in thường bằng 2 cách
 /* Sử dụng hàm có sẵn
Không sử dụng hàm có sẵn
*/
public class CharacterString3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.print("Input String: ");
		str = sc.nextLine();
		
		String newStr = "";
		for(int i = 0 ; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				newStr += (char)(ch + 32);
			}else {
				newStr += ch;
			}
		}
		System.out.println(newStr);
	}
}
