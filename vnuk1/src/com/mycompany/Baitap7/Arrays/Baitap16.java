package com.mycompany.Baitap7.Arrays;
//Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Sắp xếp số dương tăng dần, âm giảm dần. Vị trí tương đối không thay đổi

import java.util.Scanner;

public class Baitap16 {
	public static void decreasingSort(int[] arr) {
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			for(int j = i + 1 ; j < arr.length ; j++) {
				if(arr[i] < arr[j]) { // giảm dần
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	public static void increasingSort(int[] arr) {
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			for(int j = i + 1 ; j < arr.length ; j++) {
				if(arr[i] > arr[j]) { // tăng dần
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	public static void Am(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] < 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	public static void inputArray(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.printf("[%d] = " , i);
			arr[i] = sc.nextInt();
		}
	}
	
	public static void Duong(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
				System.out.print(arr[i] + " ");
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
		 
		 increasingSort(iArray);
		 System.out.print("\nSap xep mang tang dan :");
		 Duong(iArray);
		 
		 decreasingSort(iArray);
		 System.out.print("\nSap xep mang giam dan : ");
		 Am(iArray);
		 
		 
	}
}
