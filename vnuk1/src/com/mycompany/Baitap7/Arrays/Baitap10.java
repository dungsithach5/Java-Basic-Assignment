package com.mycompany.Baitap7.Arrays;

import java.util.Scanner;

public class Baitap10 {
	public static void inputArray(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i <arr.length ; i++) {
			System.out.printf(" [%d] = " , i);
			arr[i] = sc.nextInt();
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void CountSoChan(int[] arr) {
		int n;
		int count = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
				count++;
			}
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
		
		System.out.println("\nCount = ");
		CountSoChan(iArray);
	}
}
