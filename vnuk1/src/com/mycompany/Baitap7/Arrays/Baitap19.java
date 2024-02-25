package com.mycompany.Baitap7.Arrays;

import java.util.Scanner;

public class Baitap19 {
	/*
	 * Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Xóa tất cả các số âm trong mảng
	 */

	
	public static void inputArray(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < arr.length; i++) {
			System.out.printf(" [%d] = " , i);
			arr[i] = sc.nextInt();
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void XoaSoAm(int[] arr) {
		int removedCount = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] < 0) {
				removedCount++;
			}
		}
		
		int newSize = arr.length - removedCount;
		int[] newArr= new int[newSize];
		int index = 0;
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] >= 0) {
				newArr[index] = arr[i];
				index++;
			}
		}
		for(int i = 0 ; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
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
		
		
		System.out.println("\nDa xoa tat ca so am : ");
		XoaSoAm(iArray);
	}
}
