package com.mycompany.baitap5.overall;

import java.util.Scanner;

// Nhập số nguyên n. Hãy kiểm tra các chữ số của số nguyên dương n có tăng dần từ trái sang phải hay không


public class Baitap32 {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 int n;
    	 
    	 while (true) {
             System.out.print("n = ");
             n = sc.nextInt();
             if (n < 0) {
                 System.out.println("Yeu cau nhap lai n > 0");
             }else{
                 break;
             }
         }
    	 
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
}
