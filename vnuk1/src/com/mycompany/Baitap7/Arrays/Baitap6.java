package com.mycompany.Baitap7.Arrays;

import java.util.Scanner;

public class Baitap6 {
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
	
	public static void Listperfectsquare(int[] arr) {
		for(int i = 1 ; i < Math.sqrt(arr.length) ; i++) {
	        if(i*i == arr[i]) { // số binh phương = căn bặc 2 là số nguyên
	            System.out.println(arr[i] + " ");
	        }else{
	            break;
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
		
		System.out.print("\nliet ke cac so chinh phuong: ");
		Listperfectsquare(iArray);
		
	}
}
