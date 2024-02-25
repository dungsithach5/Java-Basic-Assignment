package com.mycompany.Baitap7.Arrays;

import java.util.Scanner;

//Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Liệt kê các vị trí mà giá trị tại đó là giá trị âm trong mảng 1 chiều.

public class Baitap3 {
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
	
	public static void ListedArray(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			if (arr[i] < 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		int n;
		int[] iArray;
		Scanner sc = new Scanner(System.in);
		System.out.print("Num = ");
		n = sc.nextInt();
		iArray = new int[n];
		System.out.println("Input array: ");
		inputArray(iArray);
		
		System.out.println("Entered array: ");
		printArray(iArray);
		
		System.out.print("\nGia tri am nam o vi tri: " );
		ListedArray(iArray);
		
	}

}
