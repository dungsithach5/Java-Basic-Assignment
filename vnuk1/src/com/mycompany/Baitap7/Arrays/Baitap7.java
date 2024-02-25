package com.mycompany.Baitap7.Arrays;

import java.util.Scanner;
//Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Tìm giá trị lớn nhất trong mảng.
public class Baitap7 {
	public static void inputArray(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.printf(" [%d] = " , i);
			arr[i] = sc.nextInt();
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void MaxArray(int[] arr) {
		int max = 0;
		int n;
		for(int i = 1 ; i > arr.length ; i++) {
				if (max > arr[i]) {
					max = arr[i];
			}
		}
		System.out.print(max);
	}
	
	public static void main(String[] args) {
		int[] iArray;
		Scanner sc = new Scanner(System.in);
		System.out.print("Num = ");
		int n = sc.nextInt();
		iArray = new int[n];
		System.out.println("Input array: ");
		inputArray(iArray);
		
		System.out.println("Entered array: ");
		printArray(iArray);
		
		System.out.print("\nMax = ");
		MaxArray(iArray);
		
	}
}
