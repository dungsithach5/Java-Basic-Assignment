package com.mycompany.Baitap7.Arrays;

import java.util.Scanner;

public class DEMO1D {
	public static void main(String[] args) {
		int n;
		int[] iArray;
		Scanner sc = new Scanner(System.in);
		// input n
		System.out.print("Num = ");
		n = sc.nextInt();
		iArray = new int[n];
		System.out.println("Input array: ");
		inputArray(iArray);
		
		System.out.println("Entered array: ");
		printArray(iArray);
		
		sc.next();
		System.out.print("MAX = " + maxElement(iArray));
		
		/*
		 // input Array
		iArray = new int[n];
		for(int i = 0 ; i < n ; i++) {
			System.out.printf("[%d] = " , i);
			iArray[i] = sc.nextInt();
		}
		//print Array
		for(int i = 0 ; i < n ; i++) {
			System.out.print(iArray[i] + " ");
		}
		*/
	}
		
	public static void inputArray(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < arr.length ; i++) { // arr.length mảng xuốn dòng 
			System.out.printf("[%d] = " , i);
			arr[i] = sc.nextInt();
		}
	}
		
	public static void printArray(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static int maxElement(int[] arr) {
		int max = arr[0];
		for(int i = 1 ; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}

// vao phuong thuc
