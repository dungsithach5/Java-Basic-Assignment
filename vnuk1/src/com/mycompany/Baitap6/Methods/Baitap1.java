package com.mycompany.Baitap6.Methods;

import java.util.Scanner;

//Nhập số nguyên n > 1. Viết hàm tính S =12+22 + 32 + ... + n2 

public class Baitap1 {
	public static int tong(int a) {
		int s=0;
		for(int i=1;i<=a;i++) {
			s+=i*i;
		}
		return s;
	}
	public static void main(String[] args) {
   	Scanner a=new Scanner(System.in);
   	     	 int n=a.nextInt();
   	     	 System.out.print(tong(n));
    }
}
