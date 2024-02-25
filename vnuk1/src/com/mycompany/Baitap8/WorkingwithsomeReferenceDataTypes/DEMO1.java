package com.mycompany.Baitap8.WorkingwithsomeReferenceDataTypes;

public class DEMO1 {
	public static void main(String[] args) {
		String str = "    nGuyEn    VaN    tEn    ";
		/* 1 trim() xóa khoảng trắng từ đầu và cuối
		   2 bỏ ký tự trắng giữa 2 từ
		   3 viết thường
		   viết hoa ký tự đầu trong mỗi từ
		 */
		//1
		str = str.trim();
		
		//2
		while(str.indexOf("   ") != -1) { //containts
			str = str.replace("   " , " ");// thay doi
		}
		
		//3
		str = str.toLowerCase(); // Viet thuong tu dau den cuoi
		// viet hoa ky tu dau trong moi tu
		String newStr = "";
		for (int i = 0 ; i < str.length() ; i++) {
			char ch = str.charAt(i);
			if (i == 0 || Character.isWhitespace(str.charAt(i - 1))) {
				newStr += Character.toUpperCase(ch);
			} else {
				newStr += ch;
			}
		}
		
		System.out.println(newStr);
	}
}
