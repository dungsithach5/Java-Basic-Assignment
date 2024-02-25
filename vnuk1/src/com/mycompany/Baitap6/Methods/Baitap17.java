package com.mycompany.Baitap6.Methods;

import java.util.Scanner;

public class Baitap17 {
	public static void Giamdantraisangphai(int n) {
		boolean GiamDan = true;
   	 int themang = n;
   	 int chusocuoi = themang % 10;
   	 themang /= 10;
   	 System.out.println("cac chu so co giam dan tu trai sang phai hay khong ?");
   	 while(themang != 0) {
   		 int chusokecuoi = themang % 10;
   		 themang /= 10;
   		 if (chusocuoi > chusokecuoi) {
   			 GiamDan = false;
   			 break;
   		 }
   		 else {
   			 chusocuoi = chusokecuoi;
   		 }
   	 }
   	 if(GiamDan) {
   		 System.out.println("Dung");
   	 }else {
   		 System.out.println("Sai");
   	 }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (true) {
            System.out.print("n = ");
            n = sc.nextInt();
            if (n < 100) {
                System.out.println("Yeu cau nhap lai n > 100");
            }else{
                break;
            }
        }
		Giamdantraisangphai(n);
	}
}
