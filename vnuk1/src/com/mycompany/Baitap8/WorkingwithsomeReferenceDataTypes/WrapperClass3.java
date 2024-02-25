package com.mycompany.Baitap8.WorkingwithsomeReferenceDataTypes;
//Nhập vào chuỗi String chứa số nguyên. Chuyển thành kiểu byte và in ra màn hình

public class WrapperClass3 {
	public static void main(String[] args) {
		String s = "120";
		byte i = Byte.parseByte(s);
		System.out.println(s + 50);
		System.out.println(i + 50);
	}
}
