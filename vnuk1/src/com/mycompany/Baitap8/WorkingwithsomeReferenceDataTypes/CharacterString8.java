package com.mycompany.Baitap8.WorkingwithsomeReferenceDataTypes;

public class CharacterString8 {
	public static void main(String[] args) {
		String str = "Huynh   Anh   Tien";
		while(str.indexOf("   ") != -1) { //containts
			str = str.replace("   " , " ");// thay doi
		}
		System.out.print(str);
	}
}
