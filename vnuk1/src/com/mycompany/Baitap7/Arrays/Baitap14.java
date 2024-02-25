package com.mycompany.Baitap7.Arrays;

import java.util.Scanner;

//Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Sắp xếp lẻ tăng dần nhưng giá trị khác giữ nguyên vị trí

public class Baitap14 {
	public static void increasingSort(int[] arr) {
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			for(int j = i + 1 ; j < arr.length ; j++) {
				if(arr[i] % 2 != 0) {
					if(arr[i] > arr[j] && arr[j] % 2 != 0) { // tăng dần
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					}
				}
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
	
	public static void printArray(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {		
				System.out.print(arr[i] + " ");
		}
	}
	
	public static void SoLe(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] % 2 != 0) {
				System.out.print(arr[i]);
			}
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
		 printArray(iArray);
		 
		 
		 
		 
	}
}
