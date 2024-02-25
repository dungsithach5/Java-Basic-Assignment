package com.mycompany.Baitap8.WorkingwithsomeReferenceDataTypes;

import java.util.Scanner;

//Viết hàm để tìm kiếm và xóa đi tất cả nguyên âm có trong câu.

public class CharacterString7 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input String: ");
		String str = sc.nextLine();
        
		str = str.toLowerCase();
		
        for(int i = 0; i < str.length(); i++) { 
        	char ch = str.charAt(i);
        	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
        			str = str.replace(ch , ' ');
        			str = str.replace(" ","");
        	}
        }
        System.out.print(str);
        
	}
}

