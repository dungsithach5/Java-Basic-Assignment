package com.mycompany.Baitap7.Arrays;

import java.util.Scanner;
//Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Đếm các số phần tử xuất hiện hơn 1 lần trong mảng số nguyên  cho trước.

public class Baitap28 {
	public static void inputArray(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.printf("[%d] = " , i);
			arr[i] = sc.nextInt();
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void SolanPTxuathienhon1(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
	        if (arr[i] > 1) {
	            count++;
	        }
	        System.out.print(arr[i]);
	    }
		
	}
	
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n;
		 int [] iArray;
		 System.out.print("Num = ");
		 n = sc.nextInt();
		 iArray = new int[n];
		 System.out.println("Input array :");
		 inputArray(iArray);
		 System.out.print("Entered array : ");
		 printArray(iArray);
		
		 SolanPTxuathienhon1(iArray);
		 System.out.print("\nDem so phan tu xuat hien hon 1 lan :");
		 printArray(iArray);
		 
	}
}
