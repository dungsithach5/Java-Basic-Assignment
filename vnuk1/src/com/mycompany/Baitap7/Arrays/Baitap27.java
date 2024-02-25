package com.mycompany.Baitap7.Arrays;

import java.util.Scanner;

//Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0).  Kiểm tra mảng có đối xứng hay không!
public class Baitap27 {
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
	
	public static void KTmangDoiXung(int[] arr , int n) {
		int check = 1;
		for (int i = 0; i < n / 2; i++) {
	        if (arr[i] != arr[n - i - 1]) {
	            check = 0;
	            break;
	        }
	    }
	         
	    if (check == 0) {
	        System.out.println("khong la mang doi xung");
	    } else {
	        System.out.println("la mang doi xung");
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
		
		 System.out.print("\nKiem tra mang doi xung : ");
		 KTmangDoiXung(iArray , n);
	}
}
