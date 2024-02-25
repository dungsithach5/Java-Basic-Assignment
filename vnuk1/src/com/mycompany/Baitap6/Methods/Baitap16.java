package com.mycompany.Baitap6.Methods;
//Nhập số nguyên n. Viết hàm kiểm tra các chữ số của số nguyên dương n có tăng dần từ trái sang phải hay không

import java.util.Scanner;

public class Baitap16 {
	public static void Tangdantraisangphai(int n) {
		boolean TangDan = true;
   	 int themang = n;
   	 int chusocuoi = themang % 10;
   	 themang /= 10;
   	 System.out.println("cac chu so co tang dan tu trai sang phai hay khong ?");
   	 while(themang != 0) {
   		 int chusokecuoi = themang % 10;
   		 themang /= 10;
   		 if (chusocuoi < chusokecuoi) {
   			 TangDan = false;
   			 break;
   		 }
   		 else {
   			 chusocuoi = chusokecuoi;
   		 }
   	 }
   	 if(TangDan) {
   		 System.out.println("Dung");
   	 }else {
   		 System.out.println("Sai");
   	 }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Tangdantraisangphai(n);
	}
}
