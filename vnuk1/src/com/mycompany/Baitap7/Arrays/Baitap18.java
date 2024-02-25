package com.mycompany.Baitap7.Arrays;
//Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Hãy xóa tất cả số lớn nhất trong mảng các số thực

import java.util.Scanner;

public class Baitap18 {
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
	
	public static float RemoveMaxfloat(int[] arr) {
		float removedMaxSoThuc = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(removedMaxSoThuc < arr[i]) {
				removedMaxSoThuc = arr[i];
				removedMaxSoThuc++;
			}
		}
		
		int newSize = (int)(arr.length - removedMaxSoThuc);
		int[] newArr = new int[newSize];
		int index = 0;
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] >= 0) {
				newArr[index] = (int)arr[i];
				index++;
			}
		}
		for(int i = 0 ; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		return index;
		
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
		
		System.out.println("\nXoa tat ca so thuc lon nhat: ");
		RemoveMaxfloat(iArray);
	}
}
